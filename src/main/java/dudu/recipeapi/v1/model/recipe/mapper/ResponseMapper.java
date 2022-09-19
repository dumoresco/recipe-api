package dudu.recipeapi.v1.model.recipe.mapper;

import dudu.recipeapi.v1.model.recipe.Recipe;

import dudu.recipeapi.v1.model.recipe.RecipeResponse;

public class ResponseMapper {

    public static RecipeResponse toResponse(Recipe recipe) {
        return RecipeResponse.builder()
                .id(recipe.getId())
                .name(recipe.getName())
                .img_path(recipe.getImg_path())
                .ingredients(recipe.getIngredients())
                .difficulty(recipe.getDifficulty())
                .rating(recipe.getRating())
                .preparing(recipe.getPreparing())
                .category(recipe.getCategory())
                .preparation_time(recipe.getPreparation_time())
                .build();
    }

}
