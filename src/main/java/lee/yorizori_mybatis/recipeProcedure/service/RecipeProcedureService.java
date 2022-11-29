package lee.yorizori_mybatis.recipeProcedure.service;

import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RecipeProcedureService {
    public void create( ReciepeProcedure reciepeProcedure);


}
