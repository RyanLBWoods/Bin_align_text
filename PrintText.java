
public class PrintText {

	public static void printText(String[] words, int column){
		
		int pLength = 0;
		int remain = column;
		int j = 0;
		
		String line = new String();
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
		
		lines[j] = line + " ";
		
		StringBuffer spaces = new StringBuffer();
		int k = 0;
		while(lines[k] != null){
			int b = column - lines[k].length();
			for(int a = 0;a <= b; a++){
				spaces.append(" ");
			}
			System.out.print(spaces.toString() + lines[k] + "\b");
			spaces = new StringBuffer();
			k++;
		}
		System.out.println();
	}
}
