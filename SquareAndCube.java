
import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        // Method 1: Direct Multiplication
        double square = n * n;
        double cube = n * n * n;

        // Method 2 (Alternative): Using Math.pow
        // double square = Math.pow(n, 2);
        // double cube = Math.pow(n, 3);

        System.out.println("\n--- Results ---");
        System.out.println("Square of " + n + " : " + square);
        System.out.println("Cube of " + n + "   : " + cube);

        sc.close();
    }
}