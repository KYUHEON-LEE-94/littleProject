package lee.yorizori_mybatis.recipe.controller;


import lee.yorizori_mybatis.recipe.dto.RecipeJoinRecipePro;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/recipe/detail.do")
public class RecipeDetailController {
    @Autowired
    private RecipeServiceImpl service;

    @GetMapping
    public String doGet(@RequestParam("bookId") int bookId, Model model){
        model.addAttribute("bookId",bookId);
        List<RecipeJoinRecipePro> RecipeAll =  service.findRecipeContents(bookId);
        log.info("{}",RecipeAll);
        model.addAttribute("RecipeAll",RecipeAll);
    return "/views/reciepe/recipeDetail";
    }
}
