public class StarPattern1 {
    public static void main(String[] args) {
        int n = 5; // Total 5 rows

        // 1. Outer Loop (Rows mate)
        for (int i = 1; i <= n; i++) {

            // 2. Inner Loop (Star print karva mate: 1 thi i sudhi)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // 3. Row puri thaya pachi navi line
            System.out.println();
        }
    }
}