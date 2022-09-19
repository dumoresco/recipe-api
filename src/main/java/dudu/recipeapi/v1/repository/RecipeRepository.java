package dudu.recipeapi.v1.repository;

import dudu.recipeapi.v1.model.recipe.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
