class A {

    protected int i;

    void show(){
        System.out.println("parent class A.....");
    }
}

class B extends A {
    int i;

    B(int a, int b) {

        // super.show(); way one for parent methos call using super keyword
        super.i = a;
        this.i = b;
    }

    void show() {
        super.show();
        System.out.println("super.i = " + super.i);
        System.out.println("this.i = " + this.i);
    }
}

public class Main11 {

    public static void main(String[] args) {

        B b1 = new B(40, 50);

        b1.show();

    }
}