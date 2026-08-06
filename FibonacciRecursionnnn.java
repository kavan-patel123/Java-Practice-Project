import java.util.Scanner;

// 1. Logic vaālī Class
class FibonacciRecursion {

    // Recursive Method (N-th position no number āpśe)
    public int getFibonacci(int n) {
        // BASE CONDITION
        if (n == 0) return 0;
        if (n == 1) return 1;

        // RECURSIVE CALL: Agla 2 numbers no sum
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}

// 2. Main Class
public class FibonacciRecursionnnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciRecursion fibRec = new FibonacciRecursion();

        System.out.print("Ketlā numbers print karvā chhe? ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series (Recursion): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec.getFibonacci(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}