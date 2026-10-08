
class kavanexception extends Exception {
    kavanexception(String message) {

        super(message);
    }
}

class Age_find {

    int age;

    public Age_find(int age) {

        this.age = age;
    }

    public void display() {
        try {

            if (age < 18) {
                throw new kavanexception("invalid age");
            } else {
                System.out.println("age :" + age);
            }

        } catch (Exception e) {
            System.out.println("erorr:" + e.getStackTrace());
            System.out.println("erorr:" + e.toString());
            System.out.println("erorr:" + e.getMessage());
            System.out.println("erorr:" + e.getCause());
            System.out.println("erorr:" + e.getClass());
            System.out.println("erorr:" + e.getSuppressed());
            e.printStackTrace();
        }

    }

}

public class ThrowException {
    public static void main(String[] args) {

        Age_find a1=new Age_find(12);
        a1.display();


    }
}