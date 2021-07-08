package com.recipe.project.service;

import com.recipe.project.commands.RecipeCommand;
import com.recipe.project.model.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
