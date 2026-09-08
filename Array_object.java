
class  Object
{
    String name;
    int age;
    String ca_name;

    Object(String name,int age,String ca_name)
    {
        this.name=name;
        this.age=age;
        this.ca_name=ca_name;
    }
    void getter()
    {
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("collage name : "+ca_name);
    }
} 


public class Array_object
{
    public static void main(String [] args)
    {
        Object [] o =new Object[4];

        o[0]=new Object("kavan",21,"darshan university");
        o[1]=new Object("savan",15,"darshan university");
        o[2]=new Object("badal",13,"darshan university");
        o[3]=new Object("kirtaan",20,"darshan university");

        // o[0].getter();
        // o[1].getter();

        for(int i=0;i<o.length;i++)
        {
            o[i].getter();
        }
    }

}