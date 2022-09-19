package dudu.recipeapi.v1.model.recipe.mapper;

import dudu.recipeapi.v1.model.recipe.Recipe;
import dudu.recipeapi.v1.model.recipe.RecipeRequest;

public  class RequestMapper {

    public static  Recipe toEntity(RecipeRequest recipeRequest){
       return Recipe.builder()
               .name(recipeRequest.getName())
               .img_path(recipeRequest.getImg_path())
               .ingredients(recipeRequest.getIngredients())
               .difficulty(recipeRequest.getDifficulty())
               .rating(recipeRequest.getRating())
               .preparing(recipeRequest.getPreparing())
               .category(recipeRequest.getCategory())
               .preparation_time(recipeRequest.getPreparation_time())
               .build();
   }

}
