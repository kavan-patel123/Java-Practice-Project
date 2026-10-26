
import java.io.IOException;
import java.io.FileReader;



public class Main31{
    public static void main(String []args)throws IOException
    {
        FileReader fr=new FileReader("input.txt");

        int i=0;
        while ((i=fr.read())!=-1) {
            
            System.out.print((char)i);
        }

        
        fr.close();
    }
}