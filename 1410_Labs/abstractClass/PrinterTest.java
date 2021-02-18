package abstractClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JUnit tests to test class Printer from Lab Abstract.
 * This test class should not be changed.
 */
class PrinterTest {
	private static InkjetPrinter printer1 = new InkjetPrinter("Canon Pixma");
	
	@Test
	void testPrinter_incrementSerialNumbersBy1() {
		LaserPrinter printer2 = new LaserPrinter("HB LaserJet Pro");
		LaserPrinter printer3 = new LaserPrinter("Lexmark B2338DW");
		
		assertEquals("HB LaserJet Pro", printer2.getModel());
		assertEquals("Lexmark B2338DW", printer3.getModel());
		
		assertEquals(12347, printer2.getSerialNumber());
		assertEquals(12348, printer3.getSerialNumber());
	}

	@Test
	void getModel_returnsModel() {
		assertEquals("Canon Pixma", printer1.getModel());
	}

	@Test
	void getSerialNumber_firstSerialNumber12346() {
		assertEquals(12346, printer1.getSerialNumber());
	}

	@Test
	void testToString() {
		assertEquals("InkjetPrinter: Canon Pixma #12346", printer1.toString());
	}

}
