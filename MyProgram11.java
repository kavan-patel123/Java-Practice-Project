import java.util.Scanner;

class Employee {

     int id;
     String name;
     double salary;

    public void setData(int i, String n, double s) {

         id = i;
         name = n;
         salary = s;
    }

    public void getData() {

        System.out.println("\nEmployee Details");
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}

class MyProgram11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        e.setData(id, name, salary);

        e.getData();

        sc.close();
    }
}