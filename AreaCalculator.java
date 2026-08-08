
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Circle Area
        System.out.println("--- 1. Circle ---");
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();
        double circleArea = Math.PI * r * r; //double circleArea = 3.14 * r * r;

        // 2. Rectangle Area
        System.out.println("\n--- 2. Rectangle ---");
        System.out.print("Enter length (l): ");
        double l = sc.nextDouble();
        System.out.print("Enter width (w): ");
        double w = sc.nextDouble();
        double rectangleArea = l * w;

        // 3. Triangle Area
        System.out.println("\n--- 3. Triangle ---");
        System.out.print("Enter base (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();
        double triangleArea = (b * h)/2 ; //double triangleArea = 0.5 * b * h;

        // Display All Results
        System.out.println("\n================ RESULTS ================");
        System.out.printf("Area of Circle    : %.2f\n", circleArea);
        System.out.printf("Area of Rectangle : %.2f\n", rectangleArea);
        System.out.printf("Area of Triangle  : %.2f\n", triangleArea);
        System.out.println("=========================================");

        sc.close();
    }
}