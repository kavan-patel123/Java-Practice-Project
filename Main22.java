import java.io.File;
import java.io.IOException;


public class Main22{

	public static void main(String []args) throws IOException{
{
	File f1=new File("index.txt");
	
	if(f1.createNewFile())
	{
		
		System.out.println("File create successfully");
	}
	else{
		System.out.println("File not created");
		}
} 
}
}