
import java.util.*;
public class Two_d_array
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        int  row=sc.nextInt();
        int  column=sc.nextInt();
        
        int [] [] age=new int [row][column];

        for(int i=0; i<row ; i++){

                for(int j=0;j<column;j++)
            {
                age[i][j]=sc.nextInt(); 
            }

        }
            for (int i=0;i<row;i++)
                {
                    for(int j=0;j<column;j++)
                        System.out.println(age[i][j]);
                }            
                System.out.println();
    }
}