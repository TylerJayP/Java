package assignmentPolyInheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the constructor and the public methods from 
 * the abstract class Phone.
 * 
 * = = = This test class should not be modified. = = =
 */
class DeskPhoneTest {
	private DeskPhone pushButtonPhone;
	private DeskPhone rotaryPhone;
	
	@BeforeEach
	void setUp() throws Exception {
		pushButtonPhone = new PushButtonPhone(
				"JeKaVis J-P45", new Dimension(85, 85, 28), voltage.DUAL);
		rotaryPhone = new RotaryPhone(
				"Pyle PRT45", new Dimension(205, 135, 92), voltage.V110);
	}
	
	@Test
	void deskPhone_initializeTheFields() {
		DeskPhone p = new RotaryPhone(
				"Model 500", new Dimension(143, 208, 119), voltage.V110);
		
		assertFalse(p.isConnected());
		assertEquals("Model 500 (143.0 x 208.0 x 119.0) V110 not connected", 
				p.toString());
	}

	@Test
	void plugIn_connectPhone() {
		pushButtonPhone.plugIn();
		assertTrue(pushButtonPhone.isConnected());
		
		rotaryPhone.plugIn();
		assertTrue(rotaryPhone.isConnected());
	}

	@Test
	void unplug_disconnectPhone() {
		pushButtonPhone.unplug();
		assertFalse(pushButtonPhone.isConnected());
		
		rotaryPhone.unplug();
		assertFalse(rotaryPhone.isConnected());
	}

	@Test
	void isConnected_pluggedIn_returnTrue() {
		pushButtonPhone.plugIn();
		assertTrue(pushButtonPhone.isConnected());
	}

	@Test
	void isConnected_unplugged_returnFalse() {
		rotaryPhone.unplug();
		assertFalse(rotaryPhone.isConnected());
	}
	
	@Test
	void toString_returnsModelDimensionVoltageAndConnectionInfo() {
		assertEquals("JeKaVis J-P45 (85.0 x 85.0 x 28.0) DUAL not connected", 
				pushButtonPhone.toString());
		
		rotaryPhone.plugIn();
		assertEquals("Pyle PRT45 (205.0 x 135.0 x 92.0) V110 connected", 
				rotaryPhone.toString());
	}

}
