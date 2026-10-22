import java.util.Scanner;

class Electronic_shop {

    String name;
    double price;
    String color;

    Electronic_shop(String name, double price, String color) {

        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void display() {
        System.out.println("name :" + name);
        System.out.println("price :" + price);
        System.out.println("color :" + color);
    }
}

class Mobile extends Electronic_shop {

    String ram;

    Mobile(String name, double price, String color, String ram) {
        super(name, price, color);
        this.ram = ram;
    }

    void purchase(double discount) {
        discount = (this.price * discount) / 100;
        double Fina_price = this.price - discount;
        System.out.println("final price is : " + Fina_price);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ram :" + ram);
    }

}

class T_V extends Electronic_shop {

    double inch;

    T_V(String name, double price, String color, double inch) {
        super(name, price, color);
        this.inch = inch;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("inch :" + inch);
    }
}

public class Main19 {
    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);

            Mobile m1 = new Mobile("vivo T2", 20000, "black-white", "8 GB");
            T_V t1 = new T_V("sony", 45000, "black135", 32.5);

            System.out.println(" choise Item (show_item-1 , Mobile_purchase-2 , T.v-3) ");
            int choise = sc.nextInt();

            switch (choise) {
                case 1:

                    m1.display();

                    break;
                case 2:

                    m1.purchase(15);

                    break;
                case 3:

                    t1.display();

                    break;
                default:
                    System.out.println("invalid number re enter number thk you");
            }
        }
    }

}
