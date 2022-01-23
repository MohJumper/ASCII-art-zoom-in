import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This main run test the class AsciiImage by pass text file that contains user inputs. 
 * It test for file not exist, imperfect square and write to file. 
 * @author moe A. 
 *
 */
// ----------------------------- 
/**
 * //MENOTE
 * this is probably not the most elegant solution because on line fixme if the number of lines 
 * change then this would not work. ASK and work on maybe finding cleaner solution.
 */

public class Main {

	public static void main(String[] args) throws NotPerfectSquareException {
		
		File file = new File("keyboard-input.txt");
		Scanner scnr;
		String input = "";
		int numZoom;
		
		try {
			AsciiImage as;
			scnr = new Scanner(file);
			while(scnr.hasNext()) {
				input = scnr.nextLine();
				if(input.equals("boat.txt")) {
					as = new AsciiImage(input);
					// ------------------------------ might need FIXME
					input = scnr.nextLine();
					input = scnr.nextLine();
					input = scnr.nextLine();
					numZoom = Integer.parseInt(input);
//					System.out.println(numZoom);
//					try {
					as.setZoomLevel(numZoom);

					input = scnr.nextLine();
//					System.out.println(input);
					as.writeToFile(input);
				}
				

			} 
			scnr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

