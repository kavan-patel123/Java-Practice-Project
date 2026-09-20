
//method overloding

class Display{


    public void disp()
    {
        System.out.println("name : kavan ");
    }

    public void disp(String name)
    {

        // name="kirtan";
        System.out.println("name is :"+name);
    }

    public void disp(String name ,int age)
    {

        // name="savan";
        // age=21;
        System.out.println("name is :"+name);
        System.out.println("age is :"+age);
    }
    public void disp(String name ,int age,String cource_name)
    {
        // name ="badal";
        // age=22;
        // cource_name="CA";
        System.out.println("name is  : "+name);
        System.out.println("age is  : "+age);
        System.out.println("cource name is  : "+cource_name);
    }


}



public class Method_overlodming12{

    public static void main(String [] args)
    {
        Display d1=new Display();
        d1.disp();
        d1.disp("kirtan");
        d1.disp("badal",21);
        d1.disp("savan",22,"CA");
        


        
    }
}