package dudu.recipeapi.v1.controller;

import dudu.recipeapi.v1.model.recipe.RecipeRequest;
import dudu.recipeapi.v1.model.recipe.RecipeResponse;
import dudu.recipeapi.v1.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/recipe")
@AllArgsConstructor
public class RecipeController {

    final private RecipeService recipeService;

    @GetMapping
    public List<RecipeResponse> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public RecipeResponse getRecipeById(@PathVariable String id){
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRecipe(@RequestBody @Valid RecipeRequest recipeRequest){
        recipeService.createRecipe(recipeRequest);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateRecipe(@PathVariable String id, @RequestBody @Valid RecipeRequest recipeRequest){
        recipeService.updateRecipe(id, recipeRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRecipe(@PathVariable String id){
        recipeService.deleteRecipe(id);
    }

}
