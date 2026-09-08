import java.util.*;

public class Cricket_odi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Team names
        System.out.print("Enter Team 1 Name : ");
        String team1 = sc.next();

        System.out.print("Enter Team 2 Name : ");
        String team2 = sc.next();

        // Number of overs
        System.out.print("Aap kitne Overs ka match khelna chahte hain? : ");
        int totalOvers = sc.nextInt();

        // 6 balls per over
        int ballsInOver = 6;

        // 2D Array
        // Rows = Overs
        // Columns = Balls
        int[][] team1Data = new int[totalOvers][ballsInOver];
        int[][] team2Data = new int[totalOvers][ballsInOver];

        int team1Total = 0;
        int team2Total = 0;


        // ================= TEAM 1 =================

        System.out.println("\n================================");
        System.out.println(team1 + " BATTING");
        System.out.println("================================");

        for(int i = 0; i < totalOvers; i++)
        {
            System.out.println("\n>>> OVER " + (i + 1) + " <<<");

            for(int j = 0; j < ballsInOver; j++)
            {
                System.out.print("Ball " + (j + 1) + " ke runs : ");

                team1Data[i][j] = sc.nextInt();

                team1Total =
                    team1Total + team1Data[i][j];
            }
        }


        // ================= TEAM 2 =================

        System.out.println("\n================================");
        System.out.println(team2 + " BATTING");
        System.out.println("================================");

        for(int i = 0; i < totalOvers; i++)
        {
            System.out.println("\n>>> OVER " + (i + 1) + " <<<");

            for(int j = 0; j < ballsInOver; j++)
            {
                System.out.print("Ball " + (j + 1) + " ke runs : ");

                team2Data[i][j] = sc.nextInt();

                team2Total =
                    team2Total + team2Data[i][j];
            }
        }


        // ================= SCOREBOARD =================

        System.out.println("\n===========================================");
        System.out.println("             CRICKET SCOREBOARD");
        System.out.println("===========================================");


        // Team 1 Score
        System.out.println("\n" + team1 + " SCORE");

        for(int i = 0; i < totalOvers; i++)
        {
            int overTotal = 0;

            System.out.print("Over " + (i + 1) + " : [ ");

            for(int j = 0; j < ballsInOver; j++)
            {
                System.out.print(team1Data[i][j] + " ");

                overTotal =
                    overTotal + team1Data[i][j];
            }

            System.out.println("] -> Is Over ke Total Runs: "
                    + overTotal);
        }

        System.out.println("TOTAL = " + team1Total + " Runs");


        // Team 2 Score
        System.out.println("\n" + team2 + " SCORE");

        for(int i = 0; i < totalOvers; i++)
        {
            int overTotal = 0;

            System.out.print("Over " + (i + 1) + " : [ ");

            for(int j = 0; j < ballsInOver; j++)
            {
                System.out.print(team2Data[i][j] + " ");

                overTotal =
                    overTotal + team2Data[i][j];
            }

            System.out.println("] -> Is Over ke Total Runs: "
                    + overTotal);
        }

        System.out.println("TOTAL = " + team2Total + " Runs");


        // ================= RESULT =================

        System.out.println("\n===========================================");
        System.out.println("                 RESULT");
        System.out.println("===========================================");

        if(team1Total > team2Total)
        {
            System.out.println(team1 + " WON THE MATCH!");
        }
        else if(team2Total > team1Total)
        {
            System.out.println(team2 + " WON THE MATCH!");
        }
        else
        {
            System.out.println("MATCH DRAW!");
        }

        sc.close();
    }
}