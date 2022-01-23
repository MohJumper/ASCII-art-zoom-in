import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class AsciiArtImageTest
{
	private static final String PATH = "src/test/java/";

	@Test
	void testInvalidFile () {
		String filename = "zzzzzz.zzzzz";
		
		try
		{
			AsciiImage bitImage = new AsciiImage(filename);
			fail("File shouldn't exist");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("test");
			assertTrue(true);
		}
	}

	@Test
	void testValidFile () {
		String filename = PATH+"test-file.txt";
		
		try
		{
			AsciiImage bitImage = new AsciiImage(filename);
			// for now, zoom should just return whatever was read in from the file
			String zoomed1X = bitImage.zoom();
			assertEquals("10\n11\n", zoomed1X);
		}
		catch (Exception e)
		{
			fail("File should exist");
		}
	}
}
