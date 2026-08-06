import java.util.*;

class Circle {

    public void AriaOfCircle(int r) {
        System.out.println("Area = " + (3.14 * r * r));
    }

}

class MyProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();

        System.out.print("Enter radius of first circle: ");
        int r1 = sc.nextInt();
        c1.AriaOfCircle(r1);

        Circle c2 = new Circle();

        System.out.print("Enter radius of second circle: ");
        int r2 = sc.nextInt();
        c2.AriaOfCircle(r2);

        sc.close();
    }
}