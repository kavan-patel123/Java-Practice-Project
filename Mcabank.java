import java.util.Scanner;

class MyBank {

    private int acc_no;
    double balance;
    static double ir;
    
    //static variable used (common)
    static String bankname="BANK OF BARODA";

    // Constructor
    MyBank(int acc_no) {
        this.acc_no = acc_no;
        balance = 10000;
    }

    // Display Method
    public void display() {

        System.out.println("\n------ ACCOUNT DETAILS ------");
        System.out.println("Account Number : " + acc_no);
        System.out.println("Balance        : " + balance);
        System.out.println("irate is :"+ir);
    }

    // Check Balance
    public void checkBalance() {

        System.out.println("Current Balance : " + balance);
    }

    // Deposit Method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposit Successful...");
        System.out.println("Current Balance : " + balance);
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (balance - amount >= 10000) {

            balance = balance - amount;

            System.out.println("Withdraw Successful...");
            System.out.println("Current Balance :" + balance);
        } else {

            System.out.println("Minimum Balance Must Be 10000");
        }
    }
}

public class Mcabank {
    static {
        MyBank.ir=5.6;
    }

    public static void main(String[] args) {


        System.out.println("WELCOME TO  " +MyBank.bankname);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  Account Number : ");
        int acc = sc.nextInt();

     
        MyBank b1 = new MyBank(acc);
        // MyBank b2 =new  MyBank(acc);
        

        b1.display();
        // b2.display();

        while (true) {

            System.out.println("\n========== MY BANK ==========");
            System.out.println("1. Display Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    b1.display();
                    break;

                case 2:
                    b1.checkBalance();
                    break;

                case 3:

                    System.out.print("Enter Deposit Amount : ");
                    double dep = sc.nextDouble();

                    b1.deposit(dep);
                    break;

                case 4:

                    System.out.print("Enter Withdraw Amount : ");
                    double with = sc.nextDouble();

                    b1.withdraw(with);
                    break;

                case 5:

                    System.out.println("Thank You...");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice...");
            }
        }
    }
}