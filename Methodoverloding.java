class Student
{
    public void addd(int a){

        
        System.out.println(a);
    }
    public void addd(double b,String name)
    {
        
        System.out.println(b);
        System.out.println(name);
    }
}
class Methodoverloding
{
    public static void main(String [] args)
    {
        Student s1 = new Student();

        s1.addd(20);
        
        Student s2 =new Student();
        s2.addd(25.5,"kavan");
    }
}