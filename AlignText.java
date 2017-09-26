
public class AlignText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Get text from file
			String[] parags = GetText.readFile(args[0]);
			
			//Get expected column from user input
			int column = Integer.valueOf(args[1]);
			for (int i = 0; i < parags.length; i++) {
				//Split words of text
				String[] words = SpiltText.splitText(parags[i]);
			
				//Align text and print according to the input column
				PrintText.printText(words, column);
			}
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("usage: java AlignText file_name line_length");
		} catch (NumberFormatException e) {
			System.out.println("usage: java AlignText file_name line_length");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("usage: java AlignText file_name line_length");
		}
		
	}

}
