package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;
import org.springframework.stereotype.Service;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndId(Long recipeId, Long id);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteByRecipeIdAndId(Long recipeId, Long id);
}
