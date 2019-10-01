package application;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class BookCharacterTest {

	BookCharacter character1 = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		character1 = new BookCharacter("Leo","Male","Horrors");
	
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCharConstructor() {
		assertEquals("Leo", character1.getName());
		assertEquals("Male", character1.getGender());
		assertEquals("Horrors", character1.getDescription());
	}
	
	@Test
	public void testSetName() {
		assertEquals("Leo", character1.getName());
		character1.setName("Rob");
		assertEquals("Rob", character1.getName());
	}

}
