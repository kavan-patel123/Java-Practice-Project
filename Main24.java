import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class Main24{

	public static void main(String []args) throws IOException{
{
	File f1=new File("index.txt");

	Scanner reader=new Scanner(f1);
	
	while(reader.hasNextLine())
{
	
	String Data=reader.nextLine();
	System.out.println("Start -> : "+Data); 
}

	reader.close();

	} 
}
}