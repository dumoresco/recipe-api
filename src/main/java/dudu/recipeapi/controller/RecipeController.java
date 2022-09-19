package dudu.recipeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/receipe")
public class RecipeController {

    @GetMapping("/")
    public List<String> getAllRecipes(){
        return List.of("Olá mundo");
    }

}
