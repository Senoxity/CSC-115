// Team Leader Jack Sollisch
// Group Members: Aiden Canady, Vargas Yonuel, Nexabet Toussaint
import java.util.Scanner;

class M6HW4
{
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        System.out.println("Method Project");
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes")) {
            displayMenu();
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }
        System.out.println("Program has terminated!");
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        // give your programs better names
        System.out.println("1) M6HW1: ");
        System.out.println("2) M6HW2: ");
        System.out.println("3) M6HW3: ");
        System.out.println("4) Exit: ");
        System.out.println();
        System.out.print("Selection: ");
        Scanner in = new Scanner(System.in);
        // change the cases below to better reflect the programs you are running
        switch (in.nextInt()) {
            case 1:
                getM6HW1();
                displayMenu();
                break;
            case 2:
                System.out.println("");
                System.out.println("You picked M6HW2");
                System.out.println("");
                getM6HW2();
                displayMenu();
                break;
            case 3:
                System.out.println("");
                System.out.println("You picked M6HW3");
                System.out.println("");
                getM6HW3();
                displayMenu();
                break;
            case 4:
                System.out.println("");
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("");
                System.out.println("Unrecognized option..Try again");
                System.out.println("");
                displayMenu();
                // break;
        }
    }

    // new methods containg the other programs should go here
    // I completed the first method structure for you
    // the 2nd and third method structure will follow the same pattern
    // just copy and paste the code
    // You will need to add your code from M6HW1 in the method
    public static void getM6HW1() {
        System.out.println("");
        System.out.println("");
        System.out.println("You picked M6HW1");
        System.out.println("");
        // add your code here for M6HW1
        //Vargas Yonuel
        Scanner input = new Scanner(System.in);
 
        // Get employee details
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Calculate gross pay
        double grossPay = payRate * hoursWorked;

        // Display results
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);

    }
    public static void getM6HW2() {
        System.out.println("");
        System.out.println("");
        System.out.println("You picked M6HW2");
        System.out.println("");
        // add your code here for M6HW2
        //Nexabet Toussaint
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
    public static void getM6HW3() {
        System.out.println("");
        System.out.println("");
        System.out.println("You picked M6HW3");
        System.out.println("");
        // add your code here for M6HW3
        //Aiden Canady
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