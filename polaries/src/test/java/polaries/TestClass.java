package polaries;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testNumber() throws CustomException{
		
		assertEquals("twelve ", ConvertNumberToWord.convertToWords(12));
		assertNotEquals("Ten", ConvertNumberToWord.convertToWords(9));
		assertNotNull("", ConvertNumberToWord.convertToWords(10));
		
	}

	@Test
	public void stringIsEmpty() throws CustomException{
		try {
			 ConvertNumberToWord.convertToWords(0);
			fail();
		}catch(Exception e) {
		    assertEquals("failed to convert number to Words", e.getMessage());	
		}
	}
}
