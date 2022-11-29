package lee.yorizori_mybatis;


import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.mapper.RecipeProcedureMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class RecipeProceTest {


    @Autowired
    private RecipeProcedureMapper mapper;

    @Test
    //@Disabled
    void finAllCookbooks() {
        ReciepeProcedure re = new ReciepeProcedure();
        re.setSeqNum(3);
        re.setReceipeId(2);
        String[] sr = {"12","12"};
        re.setProcedure(sr);
         mapper.create(re);
    }







}
