class Outer_class {

    String name = "xyz";

    void dp() {
            System.out.println("name : " + name);
        }

    class Inner_class {

        void disp(String name) {
            System.out.println("name : " + name);
        }
    }
}

public class Nested_member_inner_class {
    public static void main(String[] args) {

        Outer_class o1=new Outer_class();

        Outer_class.Inner_class n1= o1.new Inner_class();
        n1.disp("kavan");

        o1.dp();

    }
}