
import java.util.*;

public class Reverse_Number {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int n = sc.nextInt();

        int rev = 0;
        int digit = 0;
        int original = n; // Original value print karva mate safe rakhi

        while (n > 0) {
            digit = n % 10;       // 1. Chhello digit melvyo
            rev = rev * 10 + digit; // 2. Reverse number ma add karyo
            n = n / 10;           // 3. n ne nano karyo (Infinite loop thi bachva)
        }

        System.out.println("Reverse of " + original + " is : " + rev);

        sc.close();
    }
}