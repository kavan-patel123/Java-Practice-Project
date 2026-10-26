
import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream


public class Main28{
    public static void main(String []args)throws IOException
    {

        FileInputStream fin=new FileInputStream("ABC.txt");
        int i=0;

        
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
            
        }

        fin.close();

    }
}

