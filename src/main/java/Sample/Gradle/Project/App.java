package Sample.Gradle.Project;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String str1 = "chess-01.txt";
		String str2 = "chess-02.txt";
		String str3 = "chess-03.txt";
		String str4 = "chess-startup.txt";

		ReadFileContent rfc = new ReadFileContent();
		rfc.read(str1);
		System.out.println("***************************************");
		rfc.read(str2);
		System.out.println("***************************************");
		rfc.read(str3);
		System.out.println("***************************************");
		rfc.read(str4);
		System.out.println("***************************************");
		
		String test="test.txt";
		
		String content1="8 |oɹ|uʞ|ıq|nb|ıʞ|ıq|uʞ|oɹ|";
		String content2="7 |ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|";
		String content3="6 |  |  |  |  |  |  |  |  |";
		String content4="5 |  |  |  |  |  |  |  |  |";
		String content5="4 |  |  |  |pa|  |  |  |  |";
		String content6="3 |  |  |pa|  |  |  |  |  |";
		String content7="2 |pa|pa|  |  |  |pa|pa|pa|";
		String content8="1 |ro|kn|bi|  |ki|bi|kn|ro|";
		String content9="   a  b  c  d  e  f  g  h";
		
		WriteFileContent wfc= new WriteFileContent();
		wfc.write(test,content1,content2,content3,content4,content5,content6,content7,content8,content9);
		
	
	}

}
