import java.util.Scanner;

class Armstrong
{
    void checkarmstrong(int num)
    {
        int orignal=num;
        int sum = 0;
        int digit=0;

            while(num>0)
            {
                digit=num%10;
                sum=sum+(digit*digit*digit);
                num=num/10;
            }
            if(orignal==sum)
            {
                System.out.println("this number is ARMSTRONG...");
            }
            else
            {
                System.out.println("not ARMSTRONG NUMBER...");
            }
    }
}

class Armstrogchecker
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Armstrong arm = new Armstrong();

        System.out.println("enter 3 digitnumber : " );
        int i1 = sc.nextInt();

        arm.checkarmstrong(i1);
    }
}