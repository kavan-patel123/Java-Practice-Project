import java.util.Scanner;

public class MySimpleInterest 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. User Inputs
        System.out.print("Enter Principal Amount (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest per annum (R%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time Period in Years (T): ");
        double t = sc.nextDouble();

        // 2. Simple Interest Calculation
        double si = (p * r * t) / 100;

        // 3. Total Amount Calculation
        double totalAmount = p + si;

        // 4. Output Display
        System.out.println("\n--- Calculation Summary ---");
        System.out.println("Principal Amount : ₹" + p);
        System.out.println("Simple Interest  : ₹" + si);
        System.out.println("Total Amount     : ₹" + totalAmount);

        sc.close();
    }
}