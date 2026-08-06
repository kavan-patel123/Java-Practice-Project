import java.util.Scanner;

class Vovelorcon
{
    void checkerchar(char ch)
    {

        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
        ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
        {
            System.out.println(" VOVEL");
        }
        else
        {
            System.out.println("constance");
        } 
    }
}

class Vovelorconstance
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Vovelorcon vov = new Vovelorcon();

        System.out.println("enter one alphabets : ");
        char c1 = sc.next().charAt(0);

        vov.checkerchar(c1);
    }
}