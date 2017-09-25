
public class PrintText {

	public static void printText(String[] words, int column){
		
		int pLength = 0;
		int remain = column;
		int j = 0;
		
		String line = null;
		String[] lines = new String[1000];
		

		for(int i = 0;i < words.length; i++){
			if(words[i].length() <= remain && remain != 0){
				line = line + words[i];
//				System.out.print(words[i]);
				pLength = pLength + words[i].length();
				remain = column - pLength;
			}else if(words[i].length() > remain || remain == 0){
				lines[j] = line + "\n";
				j = j + 1;
				line = words[i];
//				System.out.print("\n" + words[i]);
				pLength = words[i].length();
				remain = column - pLength;
			}
		}
		
		lines[j] = line;
		for(int k = 0; k < lines.length; k++){
			System.out.print(lines[k]);
		}
		System.out.println();
	}
}
