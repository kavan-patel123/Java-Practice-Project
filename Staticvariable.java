class Keyword{
    int age=20;
    int roll_no=128;
    static String name="darshan univercity";


    void  display()
    {
        System.out.println(age);
        System.out.println(roll_no);
        System.out.println(name);
    }
}

class Staticvariable
{
    public static void main(String args[])
    {
    Keyword k1 =new Keyword();

    k1.display();

    Keyword k2 = new Keyword();

    k2.display();

    }

}