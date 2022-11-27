package lee.yorizori_mybatis.recipe.serviece;

import lee.yorizori_mybatis.common.web.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.mapper.RecipeMapper;
import lee.yorizori_mybatis.recipe.serviece.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private RecipeMapper recipeMapper;

    @Override
    public void create(Recipe Recipe) {
        recipeMapper.create(Recipe);
    }

    @Override
    public List<Recipe> findAllRecipe(Params params, int id) {
        return recipeMapper.findAllRecipe(params, id);
    }

    @Override
    public int recipeCount(int bookid) {
        return recipeMapper.recipeCount(bookid);
    }
}
