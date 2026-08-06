                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
import java.util.Scanner;

class SimpaleIntrest{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter p: ");
        double p = sc.nextDouble();

        System.out.println("enter r: ");
        double r = sc.nextDouble();

        System.out.println("enter t: ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;

        System.out.println("si is : " +si);

        sc.close();


    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           