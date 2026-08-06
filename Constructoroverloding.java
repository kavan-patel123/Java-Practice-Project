import java.util.*;

class MYOVERLODING {

    String name;
    int enr;
    int sem;
    String branch;

    MYOVERLODING() {
        System.out.println("Welcome to DU");
    }

    MYOVERLODING(String nm) {
        System.out.println("Hello " + nm);
    }

    MYOVERLODING(String nm, int sem, String b) {

        System.out.println("Name is " + nm);
        System.out.println("Semester is " + sem);
        System.out.println("Branch is " + b);
    }
}

class Constructoroverloding {

    public static void main(String[] args) {

        MYOVERLODING s1 = new MYOVERLODING();

        MYOVERLODING s2 = new MYOVERLODING("Kavan");

        MYOVERLODING s3 = new MYOVERLODING("Kavan", 1, "MCA");
    }
}