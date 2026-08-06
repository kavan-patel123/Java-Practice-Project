import java.util.*;

class Tr{
    public void Areaoftr(int l , int w){

        int Areaoftr = (l*w)/2;
        System.out.println("tr is "+Areaoftr);
    }
}

    class Myprogram4{
        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);

            Tr t1= new Tr();
            System.out.println("lenght is ");
            int l = sc.nextInt();

            //Tr t1 = new  Tr();
            System.out.println("width is");
            int w = sc.nextInt();

            t1.Areaoftr(l , w);
            sc.close();
        }
    }