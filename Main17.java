import my_package.MethodMaster;

public class Main17 extends MethodMaster {

    public void display()
    {
        protectedMethod();
    }
    public static void main(String[] args) {

        MethodMaster m1 = new MethodMaster();
        m1.publicMethod();
        m1.callPrivateInside();
        
        Main17 m2=new Main17();
        m2.display();
    }
}