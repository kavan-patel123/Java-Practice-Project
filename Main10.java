import java.util.Scanner;

class Cube {

    double height;
    double width;
    double depth;

    Cube(double h, double w, double d) {

        height = h;
        width = w;
        depth = d;
    }

    void display(double h, double w, double d) {

        System.out.println("heigth :" + h);
        System.out.println("width : " + w);
        System.out.println("depth :" + d);
        double cubemath = height * width * depth;
        System.out.println("MULTIPLICATION  :" + cubemath);
    }
}

class Cubeweight extends Cube {

    double weight;

    Cubeweight(double h, double w, double d, double weight) {
        super(h, w, d); //super consructor 
        this.weight = weight;

    }

    void displayweight(double w) {
        System.out.println("weight =" + w);
    }
}

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            Cubeweight c1 = new Cubeweight(30, 40.5, 50, 60.7);

            System.out.println("enter height :");
            double he = sc.nextDouble();

            System.out.println("enetr width :");
            double wi = sc.nextDouble();

            System.out.println("enetr depth :");
            double de = sc.nextDouble();

            System.out.println("enetr weight :");
            double we = sc.nextDouble();

            c1.display(he, wi, de);
            c1.displayweight(we);
        }
    }
}