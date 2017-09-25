
public class PrintText {

	public static void printText(String[] words, int column){
		int pLength = 0;
		int remain = column;
		
		for(int i = 0;i < words.length; i++){
			if(words[i].length() <= remain && remain != 0){
				System.out.print(words[i]);
				pLength = pLength + words[i].length();
				remain = column - pLength;
			}else if(words[i].length() > remain || remain == 0){
				System.out.print("\n" + words[i]);
				pLength = words[i].length();
				remain = column - pLength;
			}
		}
		
		System.out.print("\n");
	}
}
