

class pers{

    String name;
    double height;
    double weight;
    int age;
    String coll_name;
    int e_no;


    void informationStuent(){


        System.out.println("name :"+name);
        System.out.println("height :"+height);
        System.out.println("weight :"+weight);
        System.out.println("age :"+age);
        System.out.println("collage name  :"+coll_name);
        System.out.println("enrollment no  :"+e_no);
    }
}




public class Person_12{

    public static void main(String [] args)
    {

        pers p1=new pers();

        p1.name="kavan";
        p1.height=5.5;
        p1.weight=69.5;
        p1.age=21;
        p1.coll_name="darshan univercity";
        p1.e_no=260305010;

        p1.informationStuent();



    }
}