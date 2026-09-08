
class Person{
    String name="savan";
    int age=21;

}
class Doctor extends Person{
    public void show(String name1)
    
    {
        // int age=21;

        System.out.println("..... Doctor.....");
        System.out.println("my name is : "+name1);
    }
}
class Teacher extends Person{
    public void show()
    {
        System.out.println("....teacher....");
        System.out.println("my name is : "+name);
        System.out.println("my age is :"+age);
    }
}



public class Multilevel_inheritance{

    public static void main(String [] args)
    {

        Doctor d1 =new Doctor();
        Teacher t1 = new Teacher();

        d1.show("kavan");
        t1.show();





    }

}