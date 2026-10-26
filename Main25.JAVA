import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main25{

	public static void main(String []args) throws IOException{
{
	File f1=new File("index.txt");

	FileWriter fw=new FileWriter(f1,true);
	
	fw.write("I LOVE CODING...");

	fw.close();


	} 
}
}