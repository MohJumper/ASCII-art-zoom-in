import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;


/**
 * This class process ascii images and also accept list of list type char. There are three methods 
 * zoom method process the file
 * @author moe A.
 *
 */

public class AsciiImage {
	
//	private char[][] myTwoDd;
//	static List<List<Character>> imageMatrix = new ArrayList<>();
	//	private static final String FILE_PATH_OUT = "output.txt";
	private int zoomLevel = 1;
	private static String writeToFile = "";
	File file;
	private char[][] myTwod;
	File filePath;
	
	public AsciiImage(String passFile)throws FileNotFoundException{
		file = new File(passFile);
		if(!(file.exists())) {
			// remember to have to throw a new the exception as follow.
			// no need for try and catch here cuz the test doing that.
			throw new FileNotFoundException();
		}

	}
	// ------- overload the constructor for char[][] 2d.
	public AsciiImage(char pass[][]) {
		this.myTwod = pass;

	}
	// ---------------------------------- end of constructor
	
	/**
	 * 
	 * @param zoomLvl checks if zoom level is a square if not throw new custom build 
	 * exception.
	 * @return perfect square only and makes a call to zoom.
	 * @throws NotPerfectSquareException if not a perfect square.
	 */
	public int setZoomLevel(int zoomLvl) throws NotPerfectSquareException{
		int squareRoot = (int) Math.sqrt(zoomLvl);
		if (squareRoot * squareRoot != zoomLvl) {
			throw new NotPerfectSquareException(null);
			//zoomLvl = 1;
		}
		
		this.zoomLevel = squareRoot;
		zoom();
		return zoomLevel;
	}
	
	/**
	 * This method accept the asci image read from txt file and from a 2d array of char[][]
	 * 
	 * @return formated string 
	 */
	public String zoom() {
		if(file !=null) {
			try (BufferedReader br = new BufferedReader(new FileReader(file)))
	      {
				
	      	String line = "";
	      	String buildChar = "";
	      	String newStr = "";
			while((line =  br.readLine()) != null) {
				newStr = "";
				for(int i = 0; i < line.length(); i++) {
					// increase width
					for(int width = 0; width < zoomLevel; width++) {
						newStr += (char) line.charAt(i);
					}
				}
				
				// increase height
				for(int height = 0; height < zoomLevel; height++) {
					buildChar += newStr + "\n";
				}
			}
			this.writeToFile = buildChar;
			return buildChar;
		}
	      catch(Exception e) {
	    	  return "Error: Could not display file.";
	      }
		}
		else {
	      	String buildChar = "";
	      	String newStr = "";
	  		for(int j = 0; j < myTwod.length; j++) {
	  			newStr = "";
	  			for(int i = 0; i < myTwod[j].length; i++) {
	  				// increase width
		  			for(int width = 0; width < zoomLevel; width++) {
		  				// if you pass [i] [j] will get inverse format.
		  				newStr += (char) myTwod[j][i];
		  			}
		  		}
	  			
	  			// increase height
	  			for(int height = 0; height < zoomLevel; height++) {
	  				buildChar += newStr + "\n";
	  			}
	  		}
	  		this.writeToFile = buildChar;
	  		return buildChar;
		}
	}
	
	// --------------- final method >> write to output file.
	/**
	 * This method makes a call to the instance var writeToFile which contains ascii 
	 * image based on the zoom level.
	 * @param dataToTxt name and path for the output
	 */
	public static void writeToFile(String dataToTxt) {
		//MENOTE Look at lab 3 main you have created similar method

		FileOutputStream outFile;
		try {
			outFile = new FileOutputStream(dataToTxt);
			PrintWriter outFileStream = new PrintWriter(outFile);
		
			outFileStream.print(writeToFile);
			outFileStream.flush();
			outFileStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
