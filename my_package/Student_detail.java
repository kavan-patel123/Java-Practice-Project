
package my_package;

public class Student_detail {

    String name;
    int age;
    String city;
    String cource;

   public Student_detail(String name,
    int age,
    String city,
    String cource){

        this.name=name;
        this.age=age;
        this.city=city;
        this.cource=cource;

    }

    public  void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("city :"+city);
        System.out.println("cource :"+cource);
    }

}
