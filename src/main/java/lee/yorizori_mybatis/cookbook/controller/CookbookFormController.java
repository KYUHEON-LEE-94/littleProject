package lee.yorizori_mybatis.cookbook.controller;

import lee.yorizori_mybatis.common.web.YzRuntimeException;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;


@Slf4j
@Controller
@RequestMapping("/cookbook/register.do")
public class CookbookFormController {

    @Autowired
    private CookbookServiceImpl cookbookService;

    @GetMapping
    public String doGet(HttpServletRequest request, Model model){
        Cookbook cookbook = new Cookbook();
        model.addAttribute("cookbook",cookbook);

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

        if (loginId == null) {
            throw new YzRuntimeException("요리책 등록하려면 로그인이 필요합니다.", "/user/loginform.do");
        } else {
            return "/views/cookbook/cookbookForm";
        }

    }


    @PostMapping
    public String doPost(@ModelAttribute Cookbook cookbook){
        cookbookService.create(cookbook);

        return "redirect:/";
    }
}
