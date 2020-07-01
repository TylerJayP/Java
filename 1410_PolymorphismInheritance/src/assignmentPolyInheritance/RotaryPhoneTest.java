package assignmentPolyInheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests the public methods from class RotaryPhone.
 * 
 * = = = This test class should not be modified. = = =
 */
class RotaryPhoneTest {
	
	@Test
	void rotaryPhone_initializesFields() {
		RotaryPhone rotaryPhone1 = new RotaryPhone(
				"Sangyn", new Dimension(226, 220.1, 119.38), voltage.V110);
		
		assertEquals("Sangyn (226.0 x 220.1 x 119.4) V110 not connected", 
				rotaryPhone1.toString());
	}

	@Test
	void call_returnsMessageIncludingTheNumberProvided() {
		RotaryPhone rotaryPhone2 = new RotaryPhone(
				"Model 500", new Dimension(143, 208, 119), voltage.V110); 
		assertTrue(rotaryPhone2.call(8015817200L).matches("Rotating the dial to call 8015817200.?")); 
	}

}
