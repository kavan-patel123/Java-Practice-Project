import java.util.Scanner;

class Student {

    // Attributes
    int rollno;
    String name;
    int age;
    String course;
    double mark;

    // Input Method
    public void Input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Mark: ");
        mark = sc.nextDouble();
    }

    // Display Method
    public void Display() {

        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No : " + rollno);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("Mark    : " + mark);
    }
}

class Myprogram9 {

    public static void main(String[] args) {

        Student s = new Student();

        s.Input();
        s.Display();

    }
}