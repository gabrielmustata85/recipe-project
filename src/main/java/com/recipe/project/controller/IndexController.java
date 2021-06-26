package com.recipe.project.controller;

import com.recipe.project.model.Category;
import com.recipe.project.model.UnitOfMeasure;
import com.recipe.project.repository.CategoryRepository;
import com.recipe.project.repository.UnitOfMeasureRepository;
import com.recipe.project.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());


        return "index";
    }
}
