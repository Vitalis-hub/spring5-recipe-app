package vibe.springframework.domain;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import vibe.springframework.repositories.UnitOfMeasureRepository;

@RunWith(SpringRunner.class)
public class UnitOfMeasureTest {

	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;
	
	@Before
	public void setup() throws Exception {
		
	}
	
	@Test
	public void findByDescription() throws Exception{
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon", uomOptional.get().getDescription());
	}
	
	@Test
	public void findByDescriptionCup() throws Exception{
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup", uomOptional.get().getDescription());
	}

}
