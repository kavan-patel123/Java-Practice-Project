

class Parent{
    String name="kavan";
}
class Child extends Parent{


    public void show(){
        System.out.println("my name is : "+name);
    }
}

public class Single_Inheritance{
    public static void main(String args [])
    {

        Child c1 = new Child();
        c1.show();

    }
}