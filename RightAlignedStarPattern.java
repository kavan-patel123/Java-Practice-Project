public class RightAlignedStarPattern {
    public static void main(String[] args) {
        int n = 5; // Total 5 rows

        // 1. Outer Loop -> Rows mate (1 thi 5)
        for (int i = 1; i <= n; i++) {

            // 2. First Inner Loop -> Spaces print karva mate (n - i)
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // 3. Second Inner Loop -> Stars print karva mate (1 thi i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 4. Row puri thaya pachi navi line
            System.out.println();
        }
    }
}