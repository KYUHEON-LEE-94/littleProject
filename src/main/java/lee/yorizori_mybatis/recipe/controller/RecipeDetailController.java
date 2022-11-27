package lee.yorizori_mybatis.recipe.controller;

import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureService;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

//@Controller
//@RequestMapping("/recipe/detail.do")
//public class RecipeDetailController {
//
//    @Autowired
//    private RecipeProcedureServiceImpl service;
//
//    public  String doGet(@RequestParam("bookid") int bookid, Model model){
//
//
//        List<Object> RecipeAll = service.findRecipeContents(bookid);
//        model.addAttribute("RecipeAll", RecipeAll);
//
//        return "/views/reciepe/recipeDetail";
//    }
//
//
//}
