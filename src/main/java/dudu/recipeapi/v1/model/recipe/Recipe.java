package dudu.recipeapi.v1.model.recipe;

import dudu.recipeapi.v1.model.Category;
import dudu.recipeapi.v1.model.Difficulty;
import dudu.recipeapi.v1.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recipe {

    @Id
    private String id;
    private String name;
    private String img_path;
    private Category category;
    private List<Ingredient> ingredients;
    private String preparing;
    private int portion;
    private int rating;
    private Difficulty difficulty;
    private int preparation_time;


}
