package abstractClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests to test class LaserPrinter from Lab Abstract.
 * This test class should not be changed.
 */
class LaserPrinterTest {

	private LaserPrinter printer;

	@BeforeEach
	void setUp() throws Exception {
		printer = new LaserPrinter("Samsung Xpress");
	}	

	@Test
	void testLaserPrinter_full() {
		LaserPrinter p = new LaserPrinter("HB LaserJet Pro");
		assertEquals(100, p.getRemainingToner());
	}

	@Test
	void print_once_reduceTonerBy10percent() {
		printer.print();
		assertEquals(90, printer.getRemainingToner());
	}	

	@Test
	void print_threeTimes_reduceTonerBy30percent() {
		printer.print();
		printer.print();
		printer.print();
		assertEquals(70, printer.getRemainingToner());
	}	

	@Test
	void print_elevenTimes_reduceTonerUntil0() {
		for(int i = 1; i <= 10; i++) {
			printer.print();
			assertEquals(100 - i * 10, printer.getRemainingToner());
		}
		
		printer.print();
		assertEquals(0, printer.getRemainingToner());  // still 0
	}

	@Test
	void refillToner_full_remainsFull() {
		printer.refillToner();
		assertEquals(100, printer.getRemainingToner());
	}	

	@Test
	void refillToner_notFull_fillsUpTo100() {
		for(int i = 0; i < 5; i++) {
			printer.print();
		}
		printer.refillToner();
		assertEquals(100, printer.getRemainingToner());
	}


}
