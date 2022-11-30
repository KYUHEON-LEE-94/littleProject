package lee.yorizori_mybatis;


import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.dto.RecipeJoinRecipePro;
import lee.yorizori_mybatis.recipe.mapper.RecipeMapper;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class RecipeTest {


    @Autowired
    private RecipeServiceImpl service;

    @Test
    @Disabled
    void create() {
        Recipe recipe = new Recipe();
        recipe.setReceipeId(50);
        recipe.setBookId(60);
        recipe.setIngredients("fefs");
        recipe.setBookId(25);
        recipe.setReceipeName("dfsefs");
        recipe.setImgContType("sfeae");
        recipe.setImgFileName("jpg");
        recipe.setWriterId("xman0922");

        service.create(recipe);
    }

    @Test
    @Disabled
    void finAllCookbooks() {
        int s = service.recipeCount(24);
        System.out.println(s);
    }

    @Test
    //@Disabled
    void findById() {
        String type = "";
        String value = "";
        int pageSize = 3;
        int pageCount = 3;
        int requestPage = 1;
        Params params = new Params(type, value, pageSize, pageCount, requestPage);


        List<Recipe> list = service.findAllRecipe(params, 24);
        System.out.println(list);
    }

    @Test
    //@Disabled
    void findRecipeContents() {

        List<RecipeJoinRecipePro> list = service.findRecipeContents(24);
        System.out.println(list);
    }






}
