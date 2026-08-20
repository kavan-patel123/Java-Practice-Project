
import java.util.*;

public class Star_rectengle
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        int row =sc.nextInt();
        int col=sc.nextInt();

        for(int r=1;r<=row;r++)
        {
            for(int c=1;c<=col;c++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }
        // System.out.println( );
    }
}