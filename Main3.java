
import java.util.Scanner;

class Payment_system {

    void display() {
        System.out.println("this is a payment system");
    }
}

class upi extends Payment_system {
    void display() {
        super.display();
        System.out.println("enter upi pin : ");
    }
}

class Debitcard extends Payment_system {

    void display() {
        super.display();
        System.out.println("enter debit crad pin : ");
    }

}

class Netbanking extends Payment_system {
    void display() {
        super.display();
        System.out.println("enter netbanking  pin : ");
    }
}

public class Main3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            
            
            System.out.println("select no :  1-upi  : 2-debit card : 3-netbanking");
        int a = sc.nextInt();

        // dyanmic method dispach
        Payment_system p = null;

        switch (a) {
            case 1:

                p = new upi();
                p.display();
                break;
                
                case 2:
                    
                    p = new Debitcard();
                    p.display();
                    break;
                    
                    case 3:
                        
                        p = new Netbanking();
                        p.display();
                        
                        break;
                        default:
                            
                            System.out.println("invalid number pls enter valid number 😉");
                            
                        }
                    }

    }
}