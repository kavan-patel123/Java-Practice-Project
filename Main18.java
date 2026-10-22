
class Mytable {

    public synchronized void printtable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
            try {
                Thread.sleep(500);

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }
}

class Mythread extends Thread {

    Mytable Printer;
    int num;

    public Mythread(Mytable Printer,
            int num) {

        this.Printer = Printer;
        this.num = num;
    }

    public void run() {
        Printer.printtable(num);
    }

}

public class Main18 {
    public static void main(String[] args) {

        Mytable tbl=new Mytable();

        Mythread t1=new Mythread(tbl,5);
        Mythread t2=new Mythread(tbl,7);

        t1.start();
        t2.start();

    }
}