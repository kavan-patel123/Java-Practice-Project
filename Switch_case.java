
import java.util.Scanner;
public class Switch_case
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);


        while(true){
        System.out.println("enter one day (1-7) : ");
        int d = sc.nextInt();

        switch (d) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuseday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid chois 😞");
                break;
        }


    }
}
}