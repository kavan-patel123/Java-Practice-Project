
import java.util.*;

public class VotingEligibility
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter your age : ");
        int ag =sc.nextInt();

        System.out.println("age is =  "+ag);

        if(ag>=18)
        {
            System.out.println("eligibile for vote 😊");
        }
        else
        {
            System.out.println("sorry not eligibal 👼");
        }
    }
}