import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0; // Zero ketla che e ganya mate

        while (num > 0) {
            int rem = num % 10; // 1. Chello digit kadhyo

            if (rem == 0) {
                count++; // 2. Zero male etle count vadhavyo
            }

            num = num / 10; // 3. Chello digit hatavyo
        }

        // 4. Check: Jo 1 pan zero mabyo hoy (count > 0)
        if (count > 0) {
            System.out.println(original + " is a Duck Number.");
        } else {
            System.out.println(original + " is NOT a Duck Number.");
        }

        sc.close();
    }
}