
class Shape{
    void Display(String name){
    System.out.println("this is shape :"+name);
    }
}

class Circle extends Shape{

    void Display(String name)
    {
        System.out.println("this is a : "+name);
    }
}

class Squre extends Shape{

    void Display(String name)
    {
        System.out.println("this is a : "+name);
    }
}


public class Method_overriding{
    public static void main(String [] args)
    {
        // Shape ss1 = new Shape();
        Circle c1 = new Circle();
        Shape ss1 = new Shape();
        Squre s1 = new Squre();

        c1.Display("circle");
        s1.Display("Squre");
        ss1.Display("Shape");


    }
}