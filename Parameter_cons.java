
class Student{
    String name;
    int age;

    Student(String n , int a){

        name=n;
        age=a;

        // void disp(){

        //     System.out.println("name is :"+name);
        //     System.out.println("age  is :"+age);

        // }

    }

    void disp(){

            System.out.println("name is :"+name);
            System.out.println("age  is :"+age);

        }
}




public class Parameter_cons{
    public static void main(String [] args)
    {

        Student s1 = new Student("kavan" , 21);

        s1.disp();

    }
}