
import java.util.Scanner;

class Std{

    
    public void display(){
        Scanner sc =new Scanner(System.in);

        System.out.println("size  :");
        int size=sc.nextInt();

        int[] no=new int[size];
        int sum=0;

        System.out.println("enter one by obe size enter :");

        for(int i=0;i<size;i++)
        {
            no[i]=sc.nextInt();
        }
        
        for(int i=0;i<no.length;i++)
        {
            sum=sum + no[i];

        }

        System.out.println("sum : "+sum);

    }

    
}



public class Student_array3{

    public static void main(String [] args)
    {
        
        Std s1 = new Std();

        s1.display();
    }
}