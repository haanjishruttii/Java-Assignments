// Question : 43

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double totalBill = 0.0;
        if(units <= 50)
        {
            totalBill = units * 0.50;
        }
        else
        {
            totalBill = 50 * 0.50;  // Charges for the first 50 units
            // Charges for the remaining units
            int remainingUnits = units - 50;
            totalBill += remainingUnits * 0.75;
        }
            System.out.println("Total electricity bill: Rs. " + totalBill);
    }
}
