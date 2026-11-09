import java.util.Scanner;

/**
 * M5HW2_CanadyAiden
 */
public class M5HW2_CanadyAiden
{

    public static void main(String[] args)
    {
         // Declare variables
        String salesName, run = "yes";
        // Create scanner object for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        salesName = input.nextLine();
        while (run.equalsIgnoreCase("yes"))
        {
            final double PRICE = 4.79, SALARY = 2000;
            double comRate, salesAmount, comAmount, netSalary;
            int widgetsSold = 0, toWidgetsSold = 0, weeks = 4, i, widgetsReturned, toWidgetsReturned = 0, netTotal = 0, month = 0;
            // for loop
            for(i = 1; i <= weeks; i++)
            {
                System.out.print("Enter widgets sold for week #" + i + ": ");
                widgetsSold = input.nextInt();
                toWidgetsSold += widgetsSold;
            }
            // widgets returned for loop
            for(i = 1; i <= weeks; i++)
            {
                System.out.print("Enter widgets returned for week #" + i + ": ");
                widgetsReturned = input.nextInt();
                toWidgetsReturned += widgetsReturned;
            }
            // math
            netTotal = toWidgetsSold - toWidgetsReturned;
            if (netTotal >= 300) {
                comRate = 0.25;
            } else if (netTotal >= 200 && netTotal <= 299) {
                comRate = 0.20;
            } else if (netTotal >= 101 && netTotal <= 199) {
                comRate = 0.15;
            } else {
                comRate = 0.10;
            }
            salesAmount = netTotal * PRICE;
            comAmount = comRate * salesAmount;
            netSalary = comAmount + SALARY;
            month++;
            System.out.println("Sales associate name: " + salesName);
            System.out.println("Month #" + month);
            System.out.println("Total widgets sold: " + toWidgetsSold);
            System.out.println("Total widgets returned: " + toWidgetsReturned);
            System.out.println("Net widgets sold: " + netTotal);
            System.out.println("Widgets sales amount: " + salesAmount);
            System.out.println("Commission Amount: " + comAmount);
            System.out.println("Monthly salary: " + netSalary);
            System.out.println("Would you like to run the program again? ");
            run = input.next();
        }
        // Close the program
        System.out.println("Program has exited!");
        input.close();
    }
}