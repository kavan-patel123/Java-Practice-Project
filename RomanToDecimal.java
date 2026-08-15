

import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral character (I, V, X, L, C): ");
        // Reads input and converts to uppercase to handle small letters too
        char roman = sc.next().toUpperCase().charAt(0);

        // Switch statement to map Roman character to decimal value
        switch (roman) {
            case 'I':
                System.out.println("Decimal Value = 1");
                break;
            case 'V':
                System.out.println("Decimal Value = 5");
                break;
            case 'X':
                System.out.println("Decimal Value = 10");
                break;
            case 'L':
                System.out.println("Decimal Value = 50");
                break;
            case 'C':
                System.out.println("Decimal Value = 100");
                break;
            default:
                System.out.println("Invalid input! Please enter I, V, X, L, or C.");
                break;
        }

        sc.close();
    }
}