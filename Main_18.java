
class Myclass extends Thread {
    String name;

    Myclass(String name) {
        this.name = name;

    }

    public void run(){
         for(int i=0;i<=4;i++)
         {
            System.out.println("name : "+name);
        }
    }
}

public class Main_18 {
    public static void main(String[] args) {

        Myclass m1=new Myclass("ram");
        Myclass m2=new Myclass("Sita");
        Myclass m3=new Myclass("ravan");

        m1.start();
        m2.start();
        m3.start();
    }

}