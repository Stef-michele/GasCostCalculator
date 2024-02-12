import java.util.Scanner;

public class GasCostCalculator {
    public static void main(String[] args) {
        // declaring variables/import scanner
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double costPer100;
        double distance;
        boolean done = false;
        String trash = "";

        // bulletproof variable and run
        do {
            System.out.print("Enter number of gallons of gas in the gas tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                // clear buffer
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number, not " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number, not " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();// clear new line from buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number, not " + trash);
            }
        } while (!done);

        // calculations per 100 miles
        costPer100 = (100 / mpg) * pricePerGallon;
        // per gas tank
        distance = gallonsInTank * mpg;

        // Computer Output
        System.out.println("Cost per 100 miles is $" + costPer100);
        System.out.println("Distance the car can go on the gas tank is: " + distance);

        in.close(); // Close the Scanner
    }
}