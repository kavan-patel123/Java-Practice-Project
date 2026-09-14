

class Std{


    public void display(){


        int [] age=new int[5];

        age[0]=22;
        age[1]=24;
        age[2]=25;
        age[3]=22;
        age[4]=28;

        System.out.println("age : "+age[3]);

    }

    
}



public class Student_array2{

    public static void main(String [] args)
    {
        
        Std s1 = new Std();

        s1.display();
    }
}