import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Method (provided on studres) of get text from file.
 * 
 * @author Bin Lin 170008965
 * @version 1
 */
public class GetText {
	/**
	 * Read from the input file name and returns a string array that stores the
	 * context in the file.
	 * 
	 * @param fn
	 *            file name of the file to read
	 * @return a string array of the context that was extracted from file
	 */
	public static String[] readFile(String fn) {

		try {

			FileReader fr = new FileReader(fn); // read the file
			// store contents in a buffer
			BufferedReader bfr = new BufferedReader(fr);
			// an string array list for storing each line of content
			ArrayList<String> content = new ArrayList<String>();
			String p = null; // temper string for passing each line of contents
			while ((p = bfr.readLine()) != null) {
				content.add(p);
			}

			// String array for storing content
			String[] context = new String[content.size()];

			for (int i = 0; i < content.size(); i++) {
				context[i] = content.get(i);
			}

			bfr.close(); // close the buffer
			return context;

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("I/O Ooops: " + e.getMessage());
			System.exit(0);
		}

		// If an exception occurred we will get to here as the return statement
		// above was not executed
		// so setup a paragraphs array to return which contains the empty string
		String[] context = new String[1];
		context[0] = "";
		return context;

	}
}
