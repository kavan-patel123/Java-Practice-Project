import java.io.*;
import java.io.IOException;


public class Main26{

	public static void main(String []args) {


	File f1=new File("index.txt");

	if(f1.delete())
	{
		System.out.println("delete successfully....");
	}
	else
	{
		System.out.println("so sorryy😭");
	}



}
}