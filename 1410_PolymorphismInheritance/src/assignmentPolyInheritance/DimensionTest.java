package assignmentPolyInheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests the constructor and the public methods from 
 * class Dimension.
 * 
 * = = = This test class should not be modified. = = =
 */
class DimensionTest {
	Dimension d1 = new Dimension(19, 12, 15);
	Dimension d2 = new Dimension(14.4, 12.1, 18.4);
	
	@Test
	void dimension_initializesFields() {
		Dimension d = new Dimension(13.2, 16, 14.9);
		assertEquals("(13.2 x 16.0 x 14.9)", d.toString());
	}

	@Test
	void dimension_nonPositiveHeight_ThrowsIllegalArgumentException() {
		Exception exception = assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(0, 10.3, 9);});
		
		assertEquals("The height, width, and depth of a dimension needs to be positive.",
				exception.getMessage());
	}
	
	@Test
	void dimension_nonPositiveWidtht_ThrowsIllegalArgumentException() {
		Exception exception = assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(13.6, 0, 9);});
		
		assertEquals("The height, width, and depth of a dimension needs to be positive.",
				exception.getMessage());	
	}

	@Test
	void dimension_nonPositiveDepth_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(13.6, 10.3, 0);});
	}
	
	@Test
	void dimension_negativeValues_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(-13.6, -10.3, -9);});
	}
	
	@Test
	void getHeight_wholeNumberDimensions() {
		assertEquals(19, d1.getHeight());
	}

	@Test
	void getHeight_floatingPointNumberDimensions() {
		assertEquals(14.4, d2.getHeight());
	}
	
	@Test
	void getWidth_wholeNumberDimensions() {
		assertEquals(12, d1.getWidth());
	}

	@Test
	void getWidth_floatingPointNumberDimensions() {
		assertEquals(12.1, d2.getWidth());
	}
	
	@Test
	void getDepth_wholeNumberDimensions() {
		assertEquals(15, d1.getDepth());
	}

	@Test
	void getDepth_floatingPointNumberDimensions() {
		assertEquals(18.4, d2.getDepth());
	}

	@Test
	void toString_wholeNumberDimension_DisplayZeroAfterDecimalPoint() {
		assertEquals("(19.0 x 12.0 x 15.0)", d1.toString());
	}
	
	@Test
	void toString_floatingPointNumberDimension_DisplayOneDecimalDigit() {
		assertEquals("(14.4 x 12.1 x 18.4)", d2.toString());
	}

}
