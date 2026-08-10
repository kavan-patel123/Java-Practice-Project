
import java.util.*;

public class Commnd_line_argument
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int c = a+b;
        
        System.out.println("sum is ="+c);
    
        sc.close();
    }
}