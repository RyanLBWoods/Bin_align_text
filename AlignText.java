
public class AlignText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			String[] parags = GetText.readFile(args[0]);
			int column = Integer.valueOf(args[1]);
			String[] words = SpiltText.splitText(parags);
			PrintText.printText(words, column);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("usage: java AlignText file_name line_length");
		}
		
	}

}
