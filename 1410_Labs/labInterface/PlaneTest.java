package labInterface;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PlaneTest {

	@Test
	void test_toString() {
		
		Plane myPlane = new Plane(4, "Boing 747");
		String expected = "Boing 747 with 4 engines";
		
		Assert.assertEquals(expected, myPlane.toString());
	}

	@Test
	void test_Launch() {
		
		String expected = "Rolling until take-off";
		String actual = Plane.launch(toString());
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	void test_Land() {
		
		String expected = "Rolling to a stop";
		String actual = Plane.land(toString());
		
		Assert.assertEquals(expected, actual);
		
	}


}
