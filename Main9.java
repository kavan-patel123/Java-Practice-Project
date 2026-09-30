class Student {
    String name;
    int age;
    String cource;

    void display() {
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("cource :" + cource);

    }
}

class kavan extends Student {

    int ro_no;

    void displaykavan() {
        System.out.println("ro_no :" + ro_no);
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("cource :" + cource);
    }

}

public class Main9 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "savan";
        s1.age = 22;
        s1.cource = "Mca";

        kavan k1 = new kavan();

        k1.ro_no = 128;
        k1.name = "kavan";
        k1.age = 22;
        k1.cource = "Mca sem - 2";

        s1.display();
        k1.displaykavan();
        k1.display();

    }
}