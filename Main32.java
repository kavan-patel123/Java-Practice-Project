//BufferedReader 

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class Main32{
    public static void main(String []args)throws  IOException
    {
        FileReader fr=new FileReader("input.txt");

        BufferedReader br=new BufferedReader(fr);

        String Data=br.readLine();

        System.out.println(Data);
    }
}