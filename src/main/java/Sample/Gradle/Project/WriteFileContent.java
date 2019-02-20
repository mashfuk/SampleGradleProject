package Sample.Gradle.Project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileContent {

	String st = null;

	public String write(String str,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9) {

		try {
			FileWriter fileWriter = new FileWriter("src/test/resources/"+str);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    
		    printWriter.println(str1);
		    printWriter.println(str2);
		    printWriter.println(str3);
		    printWriter.println(str4);
		    printWriter.println(str5);
		    printWriter.println(str6);
		    printWriter.println(str7);
		    printWriter.println(str8);
		    printWriter.println(str9);
		    
		    printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return str;

	}

}
