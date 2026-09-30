class Person{

    int age;
    double height;
    double weight;

    void talk(int age){
            System.out.println(" ****** Person class ******");
            System.out.println("age :"+age);
            System.out.println("person is talk");
    }
    void walk(){
        System.out.println("person is walk");
    }
    void eat(){
        System.out.println("person is eat");
        System.out.println("");

    }

}

class Doctor extends Person{

    void Diagnose(int age){
        System.out.println("******Doctor class******");
        System.out.println("age :"+age);
        System.out.println("docter : Diagnose");
        System.out.println("");
    }
}

class Footballer extends Person{

        void playfooteball(double height){
        System.out.println("******footballer class******");
        System.out.println("height : "+height);
        System.out.println("folltballer : playing football");
        System.out.println("");
    }

}


class Businessman extends Person{

        void runbusiness(double weight){
        System.out.println("****** businessman class ******");
        System.out.println("weight :"+weight);
        System.out.println("businessman : craete business");
        System.out.println("");
    }

}

public class Main8{
    public static void main(String [] args)
    {
        

        Person p1=new Person();
        Doctor d1=new Doctor();
        Footballer f1=new Footballer();
        Businessman b1=new Businessman();

        p1.talk(40);
        p1.walk();
        p1.eat();

        d1.Diagnose(50);

        f1.playfooteball(5.8);

        b1.runbusiness(80.60);
    }
}