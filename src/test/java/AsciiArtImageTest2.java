import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class AsciiArtImageTest2
{
	@Test
	void testNotSquare() {
		char[][] bits = {{'1','0'},{'1','1'}};
		// using the raw character array, not a filename
		AsciiImage bitImage = new AsciiImage(bits);
		
		try
		{
			bitImage.setZoomLevel(5);
			fail("Not square");
		}
		catch (NotPerfectSquareException e)
		{
			assertEquals(1,1);
		}
	}
	
	@Test
	void testSimple4Square() {
		char[][] bits = {{'1','0'},{'1','1'}};
		AsciiImage bitImage = new AsciiImage(bits);
		
		try
		{
			bitImage.setZoomLevel(4);
			String zoomed4x = bitImage.zoom();
			assertEquals("1100\n1100\n1111\n1111\n", zoomed4x);
		}
		catch (Exception e)
		{
			fail("Not square");
		}
		
		
	}
}
