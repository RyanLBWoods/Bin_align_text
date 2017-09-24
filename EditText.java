
public class EditText {
	
	public static String[] editText(String[] parags, int column){
		
		String str = parags[0];
		char[] c = new char[column];
		int i = 0;
		for(;i < str.length();i+=column){
		
			if(str.length() - i > column){
				str.getChars(i, i+column, c, 0);
				System.out.println(c);
			}else{
				break;
			}
		
		}
		
		c = new char[column];
		str.getChars(i, str.length(), c, 0);
		System.out.println(c);
		return null;
		
	}
}
