
//copy constructor


class Copy_cons{
    int age;

    Copy_cons()
    {
        
    }
    Copy_cons(Copy_cons can)
    {
        this.age=can.age;
    }
}

public class Copy_constructor
{
    public static void main(String args [])
    {
         Copy_cons c1 =new Copy_cons();

        Copy_cons c2=new Copy_cons(c1);

        System.out.println("age is : "+c1.age);
    }
}