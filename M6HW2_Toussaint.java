/**
 * M6HW2_Toussaint
 */
import java.util.Scanner;
public class M6HW2_Toussaint
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

         // Constants
        final double BASE_FEE = 50.0;
        final double PER_GALLON_CHARGE = 0.20;

         // Get homeowner details
        System.out.print("Enter homeowner's name: ");
        String homeownerName = input.nextLine();
        System.out.print("Enter previous month's meter reading: ");
        int previousReading = input.nextInt();
        System.out.print("Enter current month's meter reading: ");
        int currentReading = input.nextInt();

         // Calculate water usage and charge
        int waterUsage = currentReading - previousReading;
         double totalCharge = BASE_FEE + (waterUsage * PER_GALLON_CHARGE);

         // Display results
        System.out.println("\nWater Bill Details:");
        System.out.println("Homeowner Name: " + homeownerName);
        System.out.println("Previous Meter Reading: " + previousReading + " gallons");
        System.out.println("Current Meter Reading: " + currentReading + " gallons");
        System.out.println("Total Monthly Charge: $" + totalCharge);
    }
    
}
