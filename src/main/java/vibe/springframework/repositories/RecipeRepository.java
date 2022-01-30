package vibe.springframework.repositories;
import org.springframework.data.repository.CrudRepository;

import vibe.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
