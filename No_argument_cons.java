
class Car{

    String name;

    Car(){

        name="toyota car";


    }
}




public class No_argument_cons{
    public static void main(String [] args)
    {

        Car c1 = new Car();

        // System.out.println("car name is :"+c1.name);  way 1 
    String name1 =  c1.name;                     //way 2 
    System.out.println("car name is : "+name1);
        
    }
}