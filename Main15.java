
class Test{
    

    public String public_var ="public variable ..";
    private String private_var="pktivate variable..";
    protected String protected_var="protected variable..";
    String default_var ="default variable..";

    void display()
    {
        System.out.println(private_var);
    }
}

public class Main15{
    public static void main(String []args)
    {

        Test t1=new Test();
        System.out.println(t1.public_var);
        System.out.println(t1.protected_var);
        //System.out.println(t1.display);
        t1.display();
        System.out.println(t1.default_var);
    }
}
