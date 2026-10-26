//FileOutputStream
import java.io.FileOutputStream;
import java.io.IOException;


public class Main27{
    public static void main(String []args)throws IOException
    {
        
        FileOutputStream fout = new FileOutputStream("ABC.txt");

        String str="hello! java";

        byte b[]=str.getBytes();
        fout.write(b);

        fout.close();   

    }
}