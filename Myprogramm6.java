import java.util.*;

class Average {

    public void FindAverage(int a, int b, int c) {

        double avg = (a + b + c) / 3.0;

        System.out.println("Average = " + avg);
    }
}

class Myprogram6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Average a1 = new Average();

        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int n3 = sc.nextInt();

        a1.FindAverage(n1, n2, n3);

        sc.close();
    }
}