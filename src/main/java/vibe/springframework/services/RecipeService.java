/**
 * 
 */
package vibe.springframework.services;
import java.util.Set;

import vibe.springframework.domain.Recipe;

/**
 * @author Michealvitalis
 *
 */
public interface RecipeService {
	Set<Recipe> getRecipes();
}
