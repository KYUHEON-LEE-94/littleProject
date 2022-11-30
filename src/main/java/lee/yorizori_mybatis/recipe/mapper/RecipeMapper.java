package lee.yorizori_mybatis.recipe.mapper;

import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.dto.RecipeJoinRecipePro;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecipeMapper {
    public void create(Recipe Recipe);
    public List<Recipe> findAllRecipe(@Param("params") Params params, @Param("id") int id);
    public int recipeCount(int bookid);

    public List<RecipeJoinRecipePro> findRecipeContents(int bookid);
}
