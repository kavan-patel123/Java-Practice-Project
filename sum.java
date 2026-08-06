import java.util.Scanner;

class sssss{
    public static void main(String[] args) {

        float a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextFloat();

        System.out.print("Enter second number: ");
        b = sc.nextFloat();

        c = a + b;

        System.out.println("SUM IS : " + c);

        sc.close();
    }
}