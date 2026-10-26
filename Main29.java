
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main29{
    public static void main(String []args)throws IOException
    {
        
        FileInputStream in=new FileInputStream("ABC.txt");
        FileOutputStream out=new FileOutputStream("XYZ.txt");

        int i=0;

        while((i=in.read())!=-1)
        {
            out.write(i);
        }

        System.out.println("ok bro");
        in.close();
        out.close();

    }
}