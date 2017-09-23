import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetText {
	
	public static String[] readFile(String fn){
		
		try{
			
			FileReader fr = new FileReader(fn);
			BufferedReader bfr = new BufferedReader(fr);
			ArrayList<String> content = new ArrayList<String>();
			String p = null;
			while((p = bfr.readLine()) != null){
				content.add(p);
			}
			
			String[] context = new String[content.size()];
			
			for(int i = 0; i < content.size(); i++){
				context[i] = content.get(i);
			}
			
			return context;
			
		} catch (FileNotFoundException e){
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] context = new String[1];
		context[0] = "";
		return null;
		
	}
}
