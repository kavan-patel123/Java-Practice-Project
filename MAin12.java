
abstract class Parent{

    String name="ram";

    abstract void display();

}

class Child extends Parent{

    int age=22;
    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
}


public class MAin12{
    public static void main(String [] args){

        Child c1=new Child();

        c1.display();

    }
}