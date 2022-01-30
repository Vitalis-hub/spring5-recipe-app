/**
 * 
 */
package vibe.springframework.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import vibe.springframework.domain.Category;

/**
 * @author Michealvitalis
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{
	Optional<Category> findByDescription(String description);
}
