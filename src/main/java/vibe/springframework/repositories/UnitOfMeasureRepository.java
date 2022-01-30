/**
 * 
 */
package vibe.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import vibe.springframework.domain.UnitOfMeasure;

/**
 * @author Michealvitalis
 *
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);
}
