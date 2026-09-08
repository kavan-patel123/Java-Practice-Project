import java.util.*;

public class CricketScore2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Aap kitne Overs ka match khelna chahte hain? : ");
        int totalOvers = sc.nextInt();
        
        // Fixed 6 balls ke liye columns size 6 rakha hai
        int ballsInOver = 6; 

        // 2D Array: Rows = Overs, Columns = 6 Balls
        int[][] matchData = new int[totalOvers][ballsInOver];
        int grandTotalRuns = 0;

        System.out.println("\n--- Runs ki Entry Shuru Karein ---");

        // 1. Input Loop: Har over ki har ball ke runs lena
        for (int i = 0; i < totalOvers; i++) {
            System.out.println("\n>>> OVER " + (i + 1) + " <<<");
            for (int j = 0; j < ballsInOver; j++) {
                System.out.print("Ball " + (j + 1) + " ke runs: ");
                matchData[i][j] = sc.nextInt();
                
                // Total runs saath-saath count ho rahe hain
                grandTotalRuns = grandTotalRuns + matchData[i][j];
            }
        }

        // 2. Output Loop: Scoreboard ko display karna
        System.out.println("\n===========================================");
        System.out.println("             CRICKET SCOREBOARD            ");
        System.out.println("===========================================");
        
        for (int i = 0; i < totalOvers; i++) {
            int overTotal = 0; // Har over ke runs alag se count karne ke liye
            System.out.print("Over " + (i + 1) + " : [ ");
            
            for (int j = 0; j < ballsInOver; j++) {
                System.out.print(matchData[i][j] + " ");
                overTotal = overTotal + matchData[i][j];
            }
            
            System.out.println("] -> Is Over ke Total Runs: " + overTotal);
        }

        System.out.println("-------------------------------------------");
        System.out.println("MATCH KA TOTAL SCORE: " + grandTotalRuns + " Runs");
        System.out.println("===========================================");

        sc.close();
    }
}