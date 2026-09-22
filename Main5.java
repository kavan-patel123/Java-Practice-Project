interface Grandpa{

    String name="ganeshbhai";

    void displaygrandpa();
}


interface Parent {

    String name1="rajubhai";

    void displayparent();
}


class Person implements Grandpa,Parent{

    public void displaygrandpa(){
        System.out.println("grandpa name : "+name);
    }

        public void displayparent(){
        System.out.println("Parent  name : "+name1);
    }
}




public class Main5{
    
    public static void main(String[] args) 
    {

        Person p1=new Person();

        p1.displaygrandpa();
        p1.displayparent();
        


    }
}