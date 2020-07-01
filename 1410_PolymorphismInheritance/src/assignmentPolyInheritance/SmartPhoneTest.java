package assignmentPolyInheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests the constructor and the public methods from 
 * class SmartPhone.
 * 
 * = = = This test class should not be modified. = = =
 */
class SmartPhoneTest {

	SmartPhone smartPhone = new SmartPhone("Pixel 4 XL", new Dimension(160.4, 75.1, 8.2), 128);
	
	@Test
	void smartPhone_initializesFields() {
		SmartPhone smartPhone1 = new SmartPhone("Samsung Galaxy", 
				new Dimension(150.9, 72.6, 7.7), 64);
		assertEquals("Samsung Galaxy (150.9 x 72.6 x 7.7) 64GB", smartPhone1.toString());
	}
	
	
	@Test
	void smartPhone_negativeStorage_IllegalArgumentException() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> new SmartPhone("Samsung Galaxy", 
						new Dimension(150.9, 72.6, 7.7), -64));
		
		assertTrue(exception.getMessage()
				.matches(".*[S|s]torage needs to be assigned a positive value.?"));
	}
	
	@Test
	void smartPhone_zeroStorage_IllegalArgumentException() {
		assertThrows(IllegalArgumentException.class,
				() -> new SmartPhone("Samsung Galaxy", 
						new Dimension(150.9, 72.6, 7.7), 0));
	}

	@Test
	void call_returnsMessageIncludingTheNumberProvided() {
		 assertEquals("Calling 8015817200 by selecting the number", 
				 smartPhone.call(8015817200L));
	}

	@Test
	void browse_returnsMessage() {
		 assertEquals("Browsing the web", smartPhone.browse());
	}

	@Test
	void takePicture_randomlyReturnsOneOfTwoMessages() {
		int horizontalCount = 0;
		int verticalCount = 0;
		
		for(int i = 0; i < 1000; i++) {
			String message = smartPhone.takePicture();
			if(message.matches("[T|t]aking a horizontal picture.?"))
				horizontalCount++;
			else if(message.matches("[T|t]aking a vertical picture.?"))
				verticalCount++;	
			else
				fail("The message " + message + " was none of the allowed choices.");
		}
		
		assertTrue(horizontalCount > 0 && verticalCount > 0);
	}

	@Test
	void toString_returnsModelDimensionStorageAndUnit() {
		assertEquals("Pixel 4 XL (160.4 x 75.1 x 8.2) 128GB", smartPhone.toString());
	}

}
