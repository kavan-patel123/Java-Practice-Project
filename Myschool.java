
import java.util.*;

class Studentmyschool{

    String  stud_name;
    int stu_rollno;
    char stud_batch;
    static String Sch_name="mahrshi gurukul";

    void display(String stud_name , int stu_rollno,char stud_batch)
    {

        // System.out.println("----WELCOME TO MAHRSHI GURUKUL----");
        System.out.println("School Name is : " + Sch_name);
        System.out.println("student name is : "+stud_name);
        System.out.println("student ROLLNO IS : "+stu_rollno);
        System.out.println("student bach is :  "+stud_batch);
    }
    void marks(int math ,int science,int gujrati,int hindi,int sanskrit )
        {
        System.out.println("maths mark is =  " +math);
        System.out.println("science mark is = " +science);
        System.out.println("gujrati mark is = " +gujrati);
        System.out.println("hindi mark is = " +hindi);
        System.out.println("sanscrit mark is = "+sanskrit);

    
        double sum =  math+science+gujrati+hindi+sanskrit;
        System.out.println("Total mark is  =    "+sum);

        double precentage = sum*100/500;

        System.out.println("percentage is  =  "  +precentage + "%");

        }
}

public class Myschool{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Studentmyschool ms = new Studentmyschool();

        System.out.println("enter your name : ");
        String s1 =sc.nextLine();

        System.out.println("ente your roll_no  : ");
        int r1 = sc.nextInt();

        System.out.println("ente your bach(A,B)  : ");
        char c1 = sc.next().charAt(0);

        

        System.out.println("enter your maths mark(0-100) : ");
        int m1 = sc.nextInt();

        System.out.println("enter your science mark(0-100) : ");
        int m2 = sc.nextInt();

        System.out.println("enter your gujrati mark(0-100) : ");
        int m3 = sc.nextInt();

        System.out.println("enter your hindi mark(0-100) : ");
        int m4 = sc.nextInt();

        System.out.println("enter your sanscrit mark(0-100) : ");
        int m5 = sc.nextInt();
        
        
        ms.display(s1, r1, c1);
    

        ms.marks(m1,m2,m3,m4,m5);
    }
}