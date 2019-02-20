package Sample.Gradle.Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileContent {
	
	String st = null;
	
	public String read(String str){
		
		
		
		try {
			
			
			File file = new File("src/test/resources/"+str);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(new FileReader(file));

			
			
			while ((st = br.readLine()) != null)
				System.out.println(st);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
		
		
	}
	
	

}
