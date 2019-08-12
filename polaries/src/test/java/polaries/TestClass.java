package polaries;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testNumber() {
		
		assertEquals("twelve ", ConvertNumberToWord.convertToWords(12));
		assertNotEquals("Ten", ConvertNumberToWord.convertToWords(9));
	}

}
