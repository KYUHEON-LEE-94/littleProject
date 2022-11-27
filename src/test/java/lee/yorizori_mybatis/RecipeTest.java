package lee.yorizori_mybatis;


import lee.yorizori_mybatis.common.web.Params;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;


@SpringBootTest
class RecipeTest {

    @Autowired
    private RecipeProcedureServiceImpl recipeProcedureService;

    @Autowired
    private RecipeServiceImpl recipeService;

//    @Test
//    @Disabled
//    void finAllCookbooks() {
//        List<Object> list = service.findRecipeContents(24);
//        System.out.println(list);
//    }

    @Test
    //@Disabled
    void findById() {
        int s =recipeService.recipeCount(24);
        System.out.println(s);
    }

    @Test
    @Disabled
    void countBySearchOption() {

    }

    @Test
    @Disabled
    void findByIdAndPasswd() {

    }




}
