class Parent
{
    Parent()
    {
        System.out.println("this is parent counstroctor");
    }
}

class Child extends Parent{

    Child(String name){

        // name="raj";

        System.out.println("this is child counstroctor");
        System.out.println("name is : "+name);
    }
}



public class Inheritance_constructor1{

    public static void main(String [] args) {


        // Child c1 = new Child("kavan");

        Parent p1 = new Parent();

        
        


    }
    
}