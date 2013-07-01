import static org.junit.Assert.*;

import org.junit.Test;

public class YearTest1 {

//	@Test
//	public void testLowerDate() {
//			
//		String date="0/12/03";
//		int a=0;
//		String result = year.getLowerDate(date);
//		
//		assertEquals("12/03/2000", result);
//	}
	
	@Test
	public void textCorrectOrder(){
		String date="03/05/05";
		String result = Year.getLowerDate(date);
		assertEquals("05/05/2003", result);
	}
	
	@Test
	public void textCorrectYear(){
		String date="2003/05/05";
		String result = Year.getLowerDate(date);
		assertEquals("05/05/2003", result);
	}
	
	@Test
	public void textCorrectDay(){
		String date="35/05/05";
		String result = Year.getLowerDate(date);
		assertEquals("05/05/2035", result);
	}
	
	@Test
	public void textCorrectDay2(){
		String date="35/15/05";
		String result = Year.getLowerDate(date);
		assertEquals("15/05/2035", result);
	}
	
	@Test
	public void textIncorrectDate(){
		String date="13/13/13";
		String result = Year.getLowerDate(date);
		assertEquals("Error", result);
	}
	
	@Test
	public void textIncorrectDate1900(){
		String result = Year.getLowerDate("13/12/1993");
		assertEquals("Error", result);
	}
	
	@Test
	public void textIncorrectMonth(){
		String date="29/02/00";
		String result = Year.getLowerDate(date);
		assertEquals("Error", result);
	}
	
	@Test
	public void textIncorrectDay2(){
		String date="31/2/0";
		String result = Year.getLowerDate(date);
		assertEquals("Error", result);
	}
	
	@Test
	public void textIncorrectDay3(){
		String date="31/2/1";
		String result = Year.getLowerDate(date);
		assertEquals("31/01/2002", result);
	}
	
	
}
