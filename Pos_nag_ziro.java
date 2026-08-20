
import java.util.Scanner;
public class Pos_nag_ziro
{
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER SAIZE OF ARRAY  :  ");
        int size = sc.nextInt();

        int a []=new int [size];
        

        System.out.println("enter element :  ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int posi=0;
        int nag=0;
        int zero=0;

        for(int i=0;i<a.length;i++)
        {
            if(0<a[i])
            {
                posi++;
            }
            else if(a[i]<0)
            {
                nag++;
            }
            else
            {
                zero++;
            }
        }

        System.out.println("positive number is  :"+posi);
        System.out.println("negetive  number is  :"+nag);
        System.out.println("zero   number is  :"+zero);
        

    }
}