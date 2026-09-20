
import java.util.*;

class persons12{

    String name;
    double height;
    double weight;
    int age;
    String coll_name;
    int e_no;



    persons12(String name,
    double height,
    double weight,
    int age,
    String coll_name,
    int e_no){

        this.name=name;
        this.height=height;
        this.weight=weight;
        this.age=age;
        this.coll_name=coll_name;
        this.e_no=e_no;


    }


    void informationStuent(){


        System.out.println("***** STUDENT INFORMATION ***** ");

        System.out.println("name :"+name);
        System.out.println("height :"+height);
        System.out.println("weight :"+weight);
        System.out.println("age :"+age);
        System.out.println("collage name  :"+coll_name);
        System.out.println("enrollment no  :"+e_no);
    }
}




public class Person_1234{

    public static void main(String [] args)
    {

        Scanner sc =new Scanner(System.in);

        // pers p1=new pers();

        System.out.println("enter your name :");
        String nm=sc.nextLine();

        System.out.println("enter your height :");
        double hi=sc.nextDouble();

        System.out.println("enter your weight:");
        double we=sc.nextDouble();

        System.out.println("enter your age :");
        int ag=sc.nextInt();

        System.out.println("enter your collage name :");
        String cn=sc.next();


        System.out.println("enter your enrollment no :");
        int en=sc.nextInt();

        System.out.println("STUDENT 1");
        persons12 p1=new persons12(nm,hi,we,ag,cn,en);
        p1.informationStuent();




         System.out.println("enter your name :");
        String nm1=sc.nextLine();

        System.out.println("enter your height :");
        double hi1=sc.nextDouble();

        System.out.println("enter your weight:");
        double we1=sc.nextDouble();

        System.out.println("enter your age :");
        int ag1=sc.nextInt();

        System.out.println("enter your collage name :");
        String cn1=sc.next();


        System.out.println("enter your enrollment no :");
        int en1=sc.nextInt();

        System.out.println("STUDENT 2");
        persons12 p2=new persons12(nm1,hi1,we1,ag1,cn1,en1);
        p2.informationStuent();

        



    }
}