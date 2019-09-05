package co.gc.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.recipes.entity.RecipeDetails;

public interface RecipeDetailsRepository extends JpaRepository<RecipeDetails, Integer> {

}
