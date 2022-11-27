package lee.yorizori_mybatis.recipe.serviece;

import lee.yorizori_mybatis.common.web.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecipeService {
    public void create(Recipe Recipe);
    public List<Recipe> findAllRecipe(Params params, int id);
    public int recipeCount(int bookid);
}
