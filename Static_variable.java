//static variable , static method , static class 


class Stat {

    String name;
    int age;

    static String collage_name = "Darshhn univercity";

    public Stat(String nm, int ag) {
        name = nm;
        age = ag;
    }

    static void disp(String nm, int ag) {

        System.err.println("name :"+nm);
        System.err.println("age  :"+ag);

    }

}

public class Static_variable {
    public static void main(String[] args) {

        Stat s1 = new Stat("ram", 21);
        Stat s2 = new Stat("syam", 22);

        System.out.println("name :" + s1.name);
        System.out.println("age :" + s1.age);
        System.out.println("name :" + s2.name);
        System.out.println("age :" + s2.age);
        System.out.println("collage name :" + Stat.collage_name);

        Stat.disp("Lakshman", 34);

    }
}