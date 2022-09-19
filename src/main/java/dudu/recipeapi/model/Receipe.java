package dudu.recipeapi.model;

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
public class Receipe {

    @Id
    private String id;
    private Category category;
    private List<Ingredient> ingredients;
    private String preparing;
    private int portion;
    private int rating;
    private Difficulty difficulty;


}
