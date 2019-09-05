package co.gc.recipes;

import org.springframework.beans.factory.annotation.Autowired;

import co.gc.recipes.entity.RecipeDbEntry;
import co.gc.recipes.repository.RecipeDetailsRepository;
import co.gc.recipes.repository.UserRepository;

public class DatabaseController {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RecipeDbEntry recipeRepo;
	
	@Autowired
	RecipeDetailsRepository rdRepo;
	
	
}
