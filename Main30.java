
import java.io.FileWriter;
import java.io.IOException;



public class Main30{
    public static void main(String []args)throws IOException
    {
        FileWriter fw=new FileWriter("input.txt");

        fw.write("hello! python");

        System.out.println("ok");
        fw.close();
    }
}