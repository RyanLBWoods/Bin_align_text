/**
 * CS5001 Practice 1 - Align Text.
 * 
 * @author Bin Lin 170008965
 * @version 1
 */
public class AlignText {
	/**
	 * Main method for text align.
	 * 
	 * @param args Input arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// Get text from file
			String[] parags = GetText.readFile(args[0]);
			// Get expected column from user input
			int column = Integer.valueOf(args[1]);
			char mode;
			// Get expected align mode
			if (args.length == 2) {
				mode = 'R';
			} else {
				mode = args[2].charAt(0);
			}

			for (int i = 0; i < parags.length; i++) {
				// Invoke split function to split words of text
				String[] words = SpiltText.splitText(parags[i]);
				// Invoke align and print function to align text and print according to the input column
				PrintText.printText(words, column, mode);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("usage: java AlignText file_name line_length <align_mode>");
			System.exit(0);
		} catch (NumberFormatException e) {
			System.out.println("usage: java AlignText file_name line_length <align_mode>");
			System.exit(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("usage: java AlignText file_name line_length <align_mode>");
			System.exit(0);
		}

	}

}
