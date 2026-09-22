//single inheritance

class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("name :" + name);
        System.out.println("this is a parent class");
    }
}

class Child extends Parent {


    // String name;

    public Child(String name) {
        super(name);
        
    }

    

    void display() {

        System.out.println("name :" + name);
        System.out.println("this is a child class");

    }

}

public class Main1 {
    public static void main(String[] args) {

        Child c1=new Child("kavan");
        Parent p1=new Parent("savan");
        p1.display();
        c1.display();

    }
}