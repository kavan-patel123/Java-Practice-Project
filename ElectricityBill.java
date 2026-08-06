import java.util.Scanner;

public class ElectricityBill {

    // Method to calculate bill using arithmetic operators
    public static double calculateBill(int units) {
        double totalBill = 0;

        if (units <= 100) {
            totalBill = units * 5.0;
        } 
        else if (units <= 200) {
            // First 100 units @ ₹5 + Remaining units @ ₹7
            totalBill = (100 * 5.0) + ((units - 100) * 7.0);
        } 
        else {
            // First 100 @ ₹5 + Next 100 @ ₹7 + Remaining units @ ₹10
            totalBill = (100 * 5.0) + (100 * 7.0) + ((units - 200) * 10.0);
        }

        return totalBill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();

        
            double totalAmount = calculateBill(units);

            System.out.println("\n--- Electricity Bill Summary ---");
            System.out.println("Units Consumed : " + units);
            System.out.println("Total Amount   : ₹" + totalAmount);
        }

    }
