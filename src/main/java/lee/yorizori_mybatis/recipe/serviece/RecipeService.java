package lee.yorizori_mybatis.recipe.serviece;

import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;

import java.util.List;


public interface RecipeService {
    public void create(Recipe Recipe);
    public List<Recipe> findAllRecipe(Params params, int id);
    public int recipeCount(int bookid);

    public List<Recipe> findRecipeContents(int bookid);
}
