import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Factorial mate 'fact' long rakhiye chhiye, kyonke answer moto aave
        long fact = 1;

        // 1 thi num sudhi loop chalavshu
        for (int i = 1; i <= num; i++) {
            fact = fact * i; // Har vakhat multiplication thase
        }

        System.out.println("Factorial of =" + fact);

        sc.close();
    }
}