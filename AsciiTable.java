
public class AsciiTable {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("ASCII Value  |  Character");
        System.out.println("=================================");

        // 32 is Space ' ' and 127 is DEL
        for (int i = 32; i <= 127; i++) {
            System.out.printf("%-12d |  %c\n", i, (char) i);
        }

        System.out.println("=================================");
    }
}