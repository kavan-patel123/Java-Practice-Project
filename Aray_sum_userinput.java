

import java.util.*;

class Array_sum{

    void Calculate(int size)
    {

        Scanner sc =new Scanner(System.in);

        int[] arr=new int[size];

        System.out.println("enter one by one element :  ");
        // arr[i]=sc.nextInt;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {

            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("sum is array : "+sum);
        
    }
}

public class Aray_sum_userinput{

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        Array_sum a1 = new Array_sum();

        System.out.println("entyer size of array : ");
        int size=sc.nextInt();

        // System.out.println("enter one by one element :  ");
        // arr[i]=sc.nextInt;

        a1.Calculate(size);
    }
}