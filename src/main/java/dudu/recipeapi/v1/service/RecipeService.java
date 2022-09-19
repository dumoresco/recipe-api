package dudu.recipeapi.v1.service;

import dudu.recipeapi.v1.exceptions.EntityNotFoundException;
import dudu.recipeapi.v1.model.recipe.Recipe;
import dudu.recipeapi.v1.model.recipe.RecipeRequest;
import dudu.recipeapi.v1.model.recipe.RecipeResponse;
import dudu.recipeapi.v1.model.recipe.mapper.RequestMapper;
import dudu.recipeapi.v1.model.recipe.mapper.ResponseMapper;
import dudu.recipeapi.v1.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecipeService {

    final private RecipeRepository recipeRepository;

    public List<RecipeResponse> getAllRecipes() {
        return recipeRepository.findAll().stream().map(ResponseMapper::toResponse).toList();
    }

    public RecipeResponse getRecipeById(String id){
        return ResponseMapper.toResponse(recipeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id not found: "+ id)));
    }

    public void createRecipe(RecipeRequest recipeRequest) {
        Recipe recipe = RequestMapper.toEntity(recipeRequest);

        recipeRepository.save(recipe);
    }

    public void updateRecipe(String id, RecipeRequest recipeRequest) {
        Recipe oldRecipe = recipeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id not found: " + id));

        Recipe newRecipe = RequestMapper.toEntity(recipeRequest);

        newRecipe.setId(oldRecipe.getId());

        ResponseMapper.toResponse(recipeRepository.save(newRecipe));

    }

    public void deleteRecipe(String id){
        recipeRepository.deleteById(id);
    }


}
