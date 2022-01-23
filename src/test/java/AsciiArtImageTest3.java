import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class AsciiArtImageTest3 {
	private static final String PATH = "src/test/java/";
	
	@Test
	void testBasicWrite ()
	{
		// write 4x to file then read back in
		String inputFileName = PATH+"test-file.txt";
		String outputFileName = PATH+"test-out.txt";
		
		try
		{
			AsciiImage bitImage = new AsciiImage(inputFileName);
			bitImage.setZoomLevel(4);
			bitImage.writeToFile(outputFileName);

			// reading in from the output file that was just created above
			AsciiImage yugeImage = new AsciiImage(outputFileName);
			yugeImage.setZoomLevel(1);
			// zoom level 1 should just return what was read from the file
			String notExpanded = yugeImage.zoom();
			assertEquals("1100\n1100\n1111\n1111\n", notExpanded);
		}
		catch (Exception e)
		{
			fail("File should exist");
		}
	}
}
