class A{
    int i=9;
}

class B extends A{

    int i=99;

    void disp()
    {
        System.out.println(super.i);
    }
}

class C extends B{
    int i =999;

    void disp()
    {
        System.out.println(this.i);
        System.out.println(super.i);
        super.disp();
    }
}

public class Inheritance_ABC{
    public static void main(String [] args)
    {

        C c1=new C();
        c1.disp();

    }
}