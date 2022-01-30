package vibe.springframework.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

class CategoryTest {
	Category category;
	
	@Before(value = "")
	public void setup() {
		category = new Category();
	}
	
	@Test
	public void getId() throws Exception{
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void getDescription() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRecipes() throws Exception {
		fail("Not yet implemented");
	}

}
