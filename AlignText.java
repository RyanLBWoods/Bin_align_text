
public class AlignText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String[] parags = GetText.readFile(args[0]);
			
//			System.out.println(parags[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("usage: java AlignText file_name line_length");
		}
		
	}

}
