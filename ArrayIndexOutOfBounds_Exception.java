

import java.util.*;

public class ArrayIndexOutOfBounds_Exception{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entr array size : ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("enter" + size+ ":" );
        for(int i = 0; i < size;i++)
        {
            arr[i]=sc.nextInt();
            // System.out.println(arr[i]);
        }
        
            int userIndex = sc.nextInt();
        try {
        
        } catch (ArrayIndexOutOfBoundsException  e) {


            System.out.println("error : array index out of bound .enter valid index pls");
        }
        
    }
}