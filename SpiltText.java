import java.util.ArrayList;

public class SpiltText {
	
	public static String[] splitText(String parags){
		
//		for(int a = 0;a < parags.length;a++){
			String str = parags;
			ArrayList<String> wordList = new ArrayList<>();
//			int i = 0, j = 0;
			
			//Split the read in string in to words and load into a list.
			String[] word = str.split(" ");
			for(int i = 0;i < word.length;i++){
				wordList.add(word[i]);
			}
	
			//Put words into a string array with a space followed.
			String[] words = new String[wordList.size()];
			for(int j = 0;j < wordList.size();j++){
				words[j] = wordList.get(j) + " ";
			}
			
//			for(int k = 0;k < words.length;k++){
//				System.out.println(words[k] + words[k].length());
//			}
//		}
		

		return words;
		
	}
}
