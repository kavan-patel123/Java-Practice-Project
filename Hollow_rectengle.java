import java.util.*;

public class Hollow_rectengle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row : ");
        int n = sc.nextInt();

        System.out.print("enter column : ");
        int m = sc.nextInt();

        // Outer loop -> Rows (1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop -> Columns (1 to m)
            for (int j = 1; j <= m; j++) {
                // Boundary condition check
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");  // print, NOT println
                } else {
                    System.out.print("  ");  // 2 spaces matching "* "
                }
            }
            System.out.println(); // New line AFTER inner loop completes
        }

        sc.close();
    }
}