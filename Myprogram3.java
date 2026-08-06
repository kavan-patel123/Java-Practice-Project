import java.util.*;

class Sqre{
    public void Areaofcircle(int side){

        int Areaofcircle = side * side;

        System.out.println("side is "+Areaofcircle);

    }
}

    class Myprogram3{
        public static void main(String [] args){

            Scanner sc =new Scanner(System.in);
            
            Sqre c1 = new Sqre();

            System.out.println("side is ");
            int i1 = sc.nextInt();

            c1.Areaofcircle(i1);

            sc.close();
        }
    }