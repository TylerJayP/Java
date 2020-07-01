package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Test
	void wordEnds_TestOne() {

		String expected = "c13i";
		String actual = CodingBat.wordEnds("abcXY123XYijk","XY");
		
		assertEquals(expected, actual);
					
	}

	@Test
	void wordEnds_TestTwo() {

		String expected = "13";
		String actual = CodingBat.wordEnds("XY123XY","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestThree() {

		String expected = "11";
		String actual = CodingBat.wordEnds("XY1XY","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestFour() {

		String expected = "XY";
		String actual = CodingBat.wordEnds("XYXY","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestFive() {

		String expected = "";
		String actual = CodingBat.wordEnds("XY","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestSix() {

		String expected = "";
		String actual = CodingBat.wordEnds("Hi","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestSeven() {

		String expected = "";
		String actual = CodingBat.wordEnds("","XY");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestEight() {

		String expected = "cxziij";
		String actual = CodingBat.wordEnds("abc1xyz1i1j","1");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestNine() {

		String expected = "cxz";
		String actual = CodingBat.wordEnds("abc1xyz1","1");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestTen() {

		String expected = "cxz11";
		String actual = CodingBat.wordEnds("abc1xyz11","1");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestEleven() {

		String expected = "11";
		String actual = CodingBat.wordEnds("abc1xyz1abc","abc");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestTwelve() {

		String expected = "acac";
		String actual = CodingBat.wordEnds("abc1xyz1abc","b");
		
		assertEquals(expected, actual);
					
	}
	
	@Test
	void wordEnds_TestThirteen() {

		String expected = "1111";
		String actual = CodingBat.wordEnds("abc1abc1abc","abc");
		
		assertEquals(expected, actual);
					
	}
}
