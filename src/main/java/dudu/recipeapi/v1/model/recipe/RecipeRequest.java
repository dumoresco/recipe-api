package dudu.recipeapi.v1.model.recipe;

import dudu.recipeapi.v1.model.Category;
import dudu.recipeapi.v1.model.Difficulty;
import dudu.recipeapi.v1.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeRequest {

    @NotBlank(message = "Name cannot be empty or null")
    private String name;
    @NotBlank(message = "Name cannot be empty or null")
    private String img_path;
    @NotBlank(message = "Category cannot be empty or null")
    private Category category;
    @NotBlank(message = "Ingredients cannot be empty or null")
    private List<Ingredient> ingredients;
    @NotBlank(message = "Preparing cannot be empty or null")
    private String preparing;
    @NotBlank(message = "Portion cannot be empty or null")
    private int portion;
    @NotBlank(message = "Rating cannot be empty or null")
    private int rating;
    @NotBlank(message = "Difficulty cannot be empty or null")
    private Difficulty difficulty;
    @NotBlank(message = "Preparation time cannot be empty or null")

    @NegativeOrZero(message = "Preparation time cannot be negative or zero")
    private int preparation_time;

}
