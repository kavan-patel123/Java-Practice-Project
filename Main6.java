abstract class Vegitable {

    String name;

    Vegitable(String name) {
        this.name = name;
    }

    public abstract String toString();

}

class Potato extends Vegitable {

    String color;

    public Potato(String color) {
        super("potato");
        this.color = color;
    }

    public String toString() {
        System.out.println("this is a poteto class ");
        return this.color;
    }

}

class Brinjal extends Vegitable {

    String color;

    public Brinjal(String color) {
        super("Brinjal");
        this.color = color;
    }

    public String toString() {
        System.out.println("this is a brinjal class ");
        return this.color;
    }
}

class Tomato extends Vegitable {

    String color;

    public Tomato(String color) {
        super("Tomato");
        this.color = color;
    }

    public String toString() {
        System.out.println("this is a tometo class ");
        return this.color;
    }

}

public class Main6 {
    public static void main(String[] args) {

        Tomato t1 = new Tomato("red");
        System.out.println("name :" + t1.name);

        Brinjal b1 = new Brinjal("purpule");
        System.out.println("name :" + b1.name);

        Potato p1 = new Potato("gray");
        System.out.println("name :" + p1.name);

        System.out.println("color :" + t1.toString());
        System.out.println("color :" + b1.toString());
        System.out.println("color :" + p1.toString());
    }
}