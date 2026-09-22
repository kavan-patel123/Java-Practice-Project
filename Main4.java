
abstract class Person {

    String name;

    Person(String name) {

        this.name = name;
    }

    abstract void displayperson();

    void display() {
        System.out.println("name :" + name);
    }
}

abstract class Rahul extends Person {

    int age;

    Rahul(String name, int age) {
        super(name);
        this.age = age;
    }

    abstract void displayrahul();

    void display(int age) {
        super.display();

        System.out.println("age :" + age);
    }
}

class Mehul extends Rahul {

    Mehul(String name, int age) {
        super(name,age);

    }

    void displayperson()
    {
        System.out.println("this is a person..");
    }

    void displayrahul()
    {
        System.out.println("this is a rahul..");
    }

}

public class Main4 {
    public static void main(String[] args) {


        Mehul m1=new Mehul("kavan", 30);

        m1.displayperson();
        m1.displayrahul();
        m1.display();
        m1.display(22);
        
        
    }
}