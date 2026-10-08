class Person {
    public void display(String name,
            int age) {
        System.out.println("name :" + name);
        System.out.println("age  :" + age);
    }

    public void Sum(int a, int b) {

        int sum = 0;
        sum = a + b;
        System.out.println("sum : " + sum);
    }

    public void multiplication(int a, int b, int c) {

        double mul;
        mul = a * b * c;
        System.out.println("multipication :" + mul);

    }

    int print(int a1, int b1) {
        return a1 + b1;
    }
}

public class Main13 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.display("savan", 89);
        p1.Sum(20, 40);
        p1.multiplication(2, 3, 4);

        System.out.println("sum of a1 and a2  :  "+p1.print(22, 22));

    }
}