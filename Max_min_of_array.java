import java.util.*;

public class Max_min_of_array {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array :  ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("enter element  : ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // FIX 1: Input lene ke BAAD max aur min set kiya taaki real data mile, 0 nahi!
        int max = a[0];
        int min = a[0];

        // Is loop mein hum max aur min dhoondhenge
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
        }

        // Elements ko display karne ka loop
        System.out.println("\nAapka Array:");
        for(int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }

        // FIX 2: Final answer ko hamesha loop ke BAHAR print karein
        System.out.println("\nFinal Max Element: " + max);
        System.out.println("Final Min Element: " + min);
        
        sc.close();
    }
}