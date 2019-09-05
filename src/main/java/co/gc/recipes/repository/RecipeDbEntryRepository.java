package co.gc.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.recipes.entity.RecipeDbEntry;

public interface RecipeDbEntryRepository extends JpaRepository<RecipeDbEntry, Integer> {

}
