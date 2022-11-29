package lee.yorizori_mybatis.recipe.controller;

import lee.yorizori_mybatis.common.web.YzRuntimeException;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Slf4j
@Controller
@RequestMapping("/recipe/register.do")
public class RecipeRegistertController {

    @Value("${file.dir}")
    private String location;

    @Autowired
    private RecipeServiceImpl recipeService;

    @Autowired
    private RecipeProcedureServiceImpl recipeProcedureService;

    @GetMapping
    public String doGet(HttpServletRequest request,
                        @RequestParam("bookId") int bookId,
                        Model model){

        //th:object와 field 사용을 위해서
        Recipe recipe = new Recipe();
        model.addAttribute("recipe",recipe);

        ReciepeProcedure ReciepeProcedure = new ReciepeProcedure();
        model.addAttribute("ReciepeProcedure",ReciepeProcedure);
        //----

        //쿼리 스트링으로 넘어온 bookid값을 읽어서 recipeForm.jsp의 value에 기록할 수 있게 전달
        model.addAttribute("bookId", bookId);

        Cookie[] cookies = request.getCookies();
        String loginId = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase("loginId")) {
                    loginId = cookie.getValue();
                    model.addAttribute("loginId",loginId);
                }
            }
        }
        // 로그인 하지 않은 경우
        if (loginId == null) {
            throw new YzRuntimeException("레시피를 등록하려면 로그인이 필요합니다.", "/user/loginform.do");
        } else {
            return "/views/reciepe/recipeForm";
        }

    }


    @PostMapping
    public String doPost(@ModelAttribute("recipe") Recipe recipe,
                         @RequestParam(value = "procedure", required = false, defaultValue = "") String[] procedure,
                         @RequestParam(value = "imgFileName", required = false) MultipartFile imgFileName){

        recipeService.create(recipe);

        ReciepeProcedure rp = new ReciepeProcedure();
        rp.setReceipeId(recipe.getReceipeId());
        for(int i = 0; i<procedure.length; i++){
            rp.setSeqNum((i+1));
            rp.setProcedure(procedure[0]);
            log.info(procedure[0]);
            recipeProcedureService.create(rp);
        }



        try {
            if (!imgFileName.isEmpty()) {
                String fullPath = location + imgFileName.getOriginalFilename();
                imgFileName.transferTo(new File(fullPath));
            }

        }catch (IOException e){
            throw  new YzRuntimeException();
        }



        return "redirect:/cookbook/list.do";
    }
}
