import java.io.File;

public class Main20{
	public static void main(String []args)
{	

	File f1=new File("index.txt");
	System.out.println(" "+f1.getName());
	System.out.println(" "+f1.getAbsolutePath());
	System.out.println(" "+f1.exists());
	System.out.println(" "+f1.canWrite());
	System.out.println(" "+f1.canRead());
	System.out.println(" "+f1.length());
	
}
}
