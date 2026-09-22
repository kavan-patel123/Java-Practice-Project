//multileval inheritance 
class Grandpa {

    void display() {
        System.out.println("I AM GRANDPA ");
    }
}

class Parent extends Grandpa {

    void display() {
        System.out.println("I AM PARENT ");
    }
}



class Child extends Parent {
    void display() {
        System.out.println("I AM CHIILD");
    }
}

public class Main2 {
    public static void main(String[] args) {

        Child c1 = new Child();
        Parent p1 = new Parent();
        Grandpa g1 = new Grandpa();

        p1.display();
        c1.display();
        g1.display();

    }
}
