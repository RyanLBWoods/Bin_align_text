import java.util.ArrayList;

/**
 * Method that split every word from the file.
 * 
 * @author Bin Lin 170008965
 * @version 1
 */
public class SpiltText {
	/**
	 * Get each paragraph, split every word and return a string array the stores
	 * them.
	 * 
	 * @param parags
	 *            paragraph the get from the file
	 * @return words Return a string array that contains all the words from
	 *         paragraph
	 */
	public static String[] splitText(String parags) {

		String str = parags;
		ArrayList<String> wordList = new ArrayList<>();

		// Split paragraph into single words and load into a list.
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			wordList.add(word[i]);
		}

		// Put words into a string array with a space followed.
		String[] words = new String[wordList.size()];
		int j = 0;
		for (; j < wordList.size(); j++) {
			words[j] = wordList.get(j) + " ";
		}

		return words;

	}
}
