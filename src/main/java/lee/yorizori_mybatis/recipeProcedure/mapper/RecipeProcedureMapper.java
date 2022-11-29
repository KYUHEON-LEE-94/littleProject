package lee.yorizori_mybatis.recipeProcedure.mapper;

import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Objects;

@Mapper
public interface RecipeProcedureMapper {
    public void create(ReciepeProcedure reciepeProcedure);


}
