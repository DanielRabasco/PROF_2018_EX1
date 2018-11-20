package examen_daniel.exam_daniel;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringTest {

	// Test Case : 1-2-3-2-5-6
	@Test
	public void SameStringsShouldReturnZero(){
		MyString ms = new MyString("H");
		MyString mt = new MyString("H");
		assertEquals(0, ms.compareTo(mt));
	}
	
	@Test
	public void MyStringsWhichDifferInIAndHShouldReturnOneOrMinusOne(){
		MyString ms = new MyString("Hola");
		MyString mt = new MyString("Iola");
		MyString ms1 = new MyString("Ai");
		MyString mt1 = new MyString("Ah");
		assertEquals(-1, ms.compareTo(mt));
		assertEquals(1, ms1.compareTo(mt1));
	}
	
	@Test
	public void OneCharacterOfDifference(){
		MyString ms = new MyString("Hola");
		MyString mt = new MyString("Hol");
		assertEquals(1, ms.compareTo(mt));
	}
}
