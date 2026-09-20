

class Outer_class {

    String name = "xyz";

    void dp(){
        System.out.println("name :"+name);
    }

static class Inner_class {

        void disp(String name) {
            System.out.println("name : " + name);
        }
    }
}

public class Nested_ststic_inner_class {
    public static void main(String[] args) {

        // Outer_class o1=new Outer_class();

        //static inner class
        Outer_class.Inner_class n1= new Outer_class.Inner_class();
        n1.disp("kavan");


        //outer class
        Outer_class o1=new Outer_class();
        o1.dp();

    }
}