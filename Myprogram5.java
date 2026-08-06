import java.util.*;

class Cone {
    public static void Volumeofcone(double r,double h){

        double Volumeofcone = (3.14 * r * r * h)/3;
        System.out.println("volume of"+Volumeofcone);
    }
}

class Myprogram5{
    public static void main(String[]args){

    Scanner sc =new Scanner(System.in);

    Cone c1 = new Cone();
    System.out.println("r is ");
    double r = sc.nextDouble();

    System.out.println("h is");
    double h = sc.nextDouble();

    c1.Volumeofcone( r , h);
    sc.close();
}
}