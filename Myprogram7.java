import java.util.*;

class Student{
    Student(String name){

        System.out.println("sudent name is"+name);
    }
}

class Myprogram7{
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter name: ");

    String name = sc.nextLine();

    Student t1 =new Student(name);
    
    sc.close();
}
}