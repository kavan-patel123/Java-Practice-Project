
import java.util.Scanner;


class A{
     String name;
     int age;
    
    void get(String name ,int age){

         this.name=name;
         this.age=age;
        // int age;

    //   System.out.println("enter your name :");
      System.out.println("name is : "+name);
      System.out.println("age is : "+age);
    }
}
public class ABC{
    public static void main (String [] args)
    {

        Scanner sc =new Scanner(System.in);

        A a1=new A();
         A a2=new A();

         System.out.println("enter your name :");
         String i1 =sc.next();
        //  String i2 =sc.next();
         System.out.println("enter your age :");
         int s1 =sc.nextInt();


        System.out.println("enter your name :");
         String i2 =sc.next();
        //  String i2 =sc.next();
         System.out.println("enter your age :");
         int s2 =sc.nextInt();
        //  int s2 =sc.nextInt();

         a1.get(i1,s1);
          a2.get(i2,s2);

        //  A a2=new A();
        //   System.out.println("enter your name :");
        //  String i1 =sc.next();
        //  System.out.println("enter your age :");
        //  int s1 =sc.nextInt();


        // a1.get(i1,s1);
        // a2.get(i1,s1);

    // A a1=new A();

    
    }
}