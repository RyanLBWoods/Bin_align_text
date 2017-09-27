
public class PrintText {

	public static void printText(String[] words, int column, char mode) {
		
		int pLength = 0;
		int remain = column;
		int j = 0;
		
		String line = new String();
		String[] lines = new String[1000];
		
		//Combine words into line
		//Store line in a String array called lines
		for (int i = 0; i < words.length; i++) {
			if ((words[i].length() - 1) <= remain && remain != 0) {
				line = line + words[i];
				pLength = pLength + words[i].length();
				remain = column - pLength;
			}else if(words[i].length() > remain || remain == 0){
				lines[j] = line.substring(0, line.length() - 1) + "\n";
				j = j + 1;
				line = words[i];
				pLength = words[i].length();
				remain = column - pLength;
			}
		}
		
		//Deal with the last line
		lines[j] = line.substring(0, line.length() - 1) + "\n";
		
//		System.out.println(lines[0].length());
		//Print context
		int k = 0;
		int cspace, jspace;
		StringBuffer spaces = new StringBuffer();

		switch(mode){
			//Right align text
			case 'R':
				while(lines[k] != null){
					int b = column - lines[k].length();
					for(int a = 0;a <= b; a++){
						spaces.append(" ");
					}
					System.out.print(spaces.toString() + lines[k]);
					spaces = new StringBuffer();
					k++;
				}
				break;
			//Left align
			case 'L':
				while(lines[k] != null){
					System.out.print(lines[k]);
					k++;
				}
				break;
			//Center align text
			case 'C':
				while(lines[k] != null){
					cspace = (column - (lines[k].length() - 1));
					if(cspace % 2 == 0){
						cspace = cspace / 2;
						for(int a = 0;a < cspace; a++){
							spaces.append(" ");
						}
					}else if (cspace == 1){
						for(int a = 0;a < cspace; a++){
							spaces.append(" ");
						}
					}else if (cspace > 1 && cspace % 2 == 1 ){
						cspace = cspace / 2 + 1;
						for(int a = 0;a < cspace; a++){
							spaces.append(" ");
						}
					}
					
					System.out.print(spaces.toString() + lines[k]);
					spaces = new StringBuffer();
					k++;
				}
				break;
			//Justify align
			case 'J':
				StringBuilder jstr; 
				while(lines[k] != null){
					jspace = column - (lines[k].length() - 1);
					jstr = new StringBuilder(lines[k]);
					int m = lines[k].length() - 1;
//					int n = lines[k].length();
					if(lines[k + 1] == null){
						System.out.print(lines[k]);
						break;
					}else{
						while(m > 0 && jspace > 0){
							if(lines[k].charAt(m) == ' '){
								jstr.insert(m, " ");
								lines[k] = jstr.toString();
//								n = lines[k].length();
								jspace--;
							}
							m--;				
						}
						
					}
					
					System.out.print(lines[k]);
					k++;
				}
				break;
				
		}
		System.out.println();

	}
}
