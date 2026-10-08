
import java.util.*;

public class Arithmeticexception{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entr a : ");
        int a=sc.nextInt();

        System.out.println("entr b : ");
        int b=sc.nextInt();


        try {
            int result=a/b;
            System.out.println("result :"+result);
        } catch (ArithmeticException e) {


            System.out.println("error :  divide by 0..");
        }
        
    }
}