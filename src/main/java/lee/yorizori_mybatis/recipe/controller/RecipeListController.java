package lee.yorizori_mybatis.recipe.controller;

import lee.yorizori_mybatis.common.web.YzRuntimeException;
import lee.yorizori_mybatis.common.web.page.Page;
import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/recipe/recipeList.do")
public class RecipeListController {
    @Autowired
    private RecipeServiceImpl service;

    @GetMapping
    public String doGet(@RequestParam("bookId") int bookId,
                        @RequestParam(required = false, defaultValue = "") String type,
                        @RequestParam(required = false, defaultValue = "") String value,
                        @RequestParam(value ="size", required = false) String size,
                        @RequestParam(value="page", required = false) String selectPage,
                        Model model) {

    model.addAttribute("bookId", bookId);

        //한페이지당 3개씩 보여주겠다.
        int pageSize = 3;
        //페이지 번호 5개씩~
        int pageCount = 3;
        //요청 페이지 - default값으로 1번째 페이지 보여주겠다.
        int requestPage = 1;

        //size != null라는 건, 사용자가 요청한 사이즈가 있다는 것. 그래서 pageSize값을 변경
        if (size != null) {
            pageSize = Integer.parseInt(size);
        }

        //몇번 페이지를 보여줄것이냐
        if (selectPage != null) {
            requestPage = Integer.parseInt(selectPage);
        }

        Params params = new Params(type, value, pageSize, pageCount, requestPage);
        List<Recipe> RecipeList = service.findAllRecipe(params, bookId);
        model.addAttribute("RecipeList", RecipeList);
        model.addAttribute("params",params);

        //전체 개수를 확인하기 위해서
        int count = service.recipeCount(bookId);
        model.addAttribute("count", count);

        Page paging = new Page(params, count);
        paging.build();
        model.addAttribute("paging", paging);

    return "/views/reciepe/recipeList";
    }
}
