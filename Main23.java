import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main23{

	public static void main(String []args) throws IOException{
{
	File f1=new File("index.txt");

	FileWriter fw=new FileWriter(f1);
	
	fw.write("I LOVE JAVA..");

	fw.close();


	} 
}
}