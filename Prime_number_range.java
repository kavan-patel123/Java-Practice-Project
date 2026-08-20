import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        // 1 thi N sudhi darek number check thase
        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}