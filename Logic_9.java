import java.util.*;

public class Logic_9 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - 1; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
    }

}