

import java.util.*;

public class Array2d_array{
    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size1  and size2 :");
        int size1=sc.nextInt();
        int size2=sc.nextInt();

        int arr [] []=new int[size1][size2];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
        }
        //  System.out.println();
        }
        System.out.println("Aapke entered elements yeh hain:");
        for(int i = 0; i < size1; i++) {
            for(int j = 0; j < size2; j++) {
                System.out.println("arr["+i+"]["+j+"]"+arr[i][j]);
            }
        }
}
}