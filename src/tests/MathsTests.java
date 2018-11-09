package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import app.Maths;

class MathsTests {

	@Test
	void sum() {
		
		//expected values
		int a = 5 + 7;
		int b = 7 + 3 + 17 + 22;
		int c = 19 + 1 + 22 + 14 + 13 - 5 - 12;
		
		int[] test_a = {5, 7};
		int[] test_b = {7, 3, 17, 22};
		int[] test_c = {19, 1, 22, 14, 13, -5, -12};
		
		assertEquals(
				"sum(): case 1", 
				a, 
				Maths.sum(test_a)
		);
		
		assertEquals(
				"sum(): case 2", 
				b, 
				Maths.sum(test_b)
		);
		
		assertEquals(
				"sum(): case 3", 
				c, 
				Maths.sum(test_c)
		);
	}

}
