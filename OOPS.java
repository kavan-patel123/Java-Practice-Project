
import java.util.Scanner;



class Person{

    String name;

    public void getname(String name)
    {
        this.name=name;
    }

    public void setname()
    {
        System.out.println("name : "+name);
    }
}

public class OOPS
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER YOUR NAME :");
        String nm=sc.nextLine();

        System.out.println("ENTER YOUR NAME :");
        String nm1=sc.nextLine();

        Person p1 =new Person();
        Person p2 =new Person();
        

        p1.getname(nm);
        p1.setname();

        p2.getname(nm1);
        p2.setname();


    }
}