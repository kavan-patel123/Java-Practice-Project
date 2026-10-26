import java.io.File;
import java.io.IOException;


public class Main21{

	public static void main(String []args)
{
	File f1=new File("index.txt");
	
	if(f1.delete())
	{
		
		System.out.println("File delete successfully");
	}
	else{
		System.out.println("File not delete");
		}
} 
}