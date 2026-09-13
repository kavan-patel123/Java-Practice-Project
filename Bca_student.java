import java.util.Scanner;

class Student1{

    String name;

    public void display(String nmm)
    {

        name=nmm;
        System.out.println("name is : "+nmm);
    }
}



class Bca_student{
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);

        Student1 s1 = new Student1();

        System.out.println("enter your name : ");
        String nm=sc.nextLine();

        s1.display(nm);


        // Student1 s1 = new Student1();

    

    }
}