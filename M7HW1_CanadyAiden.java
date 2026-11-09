/**
 * Aiden Canady
 * 12/4/2024
 * M7HW1_CanadyAiden
 */
import java.util.Scanner;
public class M7HW1_CanadyAiden 
{

    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner k = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();
                int widgetsSold = getSales();
                int widgetsReturned = getReturns();
                int totalSold = calWidSold(widgetsSold, widgetsReturned);
                double salesAmount = calWidSalesAmt(totalSold);
                double commission = calComm(totalSold, salesAmount);
                double salary = calSalary(salesAmount, totalSold);
                displayValues(widgetsSold, widgetsReturned, totalSold, salesAmount, commission, salary);
                // all calls to your function/methods should come from runProgram()  method only
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = k.next();
                System.out.println();
            }
    k.close();
    System.out.println("Program has terminated!");
    }
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Aiden Canady");
        System.out.println();
        System.out.println("Widget Sales Calculator v1.3");
        System.out.println();
        

    }
    public static int getSales()
    {
        Scanner k = new Scanner(System.in);
        int widgetsSold = 0, toWidgetsSold = 0, weeks = 4, i;
        // for loop
        for(i = 1; i <= weeks; i++)
        {
            System.out.print("Enter widgets sold for week #" + i + ": ");
            widgetsSold = k.nextInt();
            toWidgetsSold += widgetsSold;
        }
        //k.close();
        return toWidgetsSold;
    }
    public static int getReturns()
    {
        Scanner k = new Scanner(System.in);
        int widgetsReturned, toWidgetsReturned = 0, weeks = 4, i;
        // for loop
        for(i = 1; i <= weeks; i++)
        {
            System.out.print("Enter widgets returned for week #" + i + ": ");
            widgetsReturned = k.nextInt();
            toWidgetsReturned += widgetsReturned;
        }
        //k.close();
        return toWidgetsReturned;
    }
    public static int calWidSold(int toWidgetsSold, int toWidgetsReturned)
    {
        int netSold = toWidgetsSold - toWidgetsReturned;
        return netSold;
    }
    public static double calWidSalesAmt(int netSold)
    {
        final double PRICE = 4.79;
        double widSalesAmt = netSold * PRICE;
        return widSalesAmt;
    }
    public static double calComm(double widSalesAmt, double netSold)
    {
        double comRate = 0, comAmount = 0;
            if (netSold >= 300) {
                comRate = 0.25;
            } else if (netSold >= 200 && netSold <= 299) {
                comRate = 0.20;
            } else if (netSold >= 101 && netSold <= 199) {
                comRate = 0.15;
            } else {
                comRate = 0.10;
            }
            comAmount = comRate * widSalesAmt;
        return comAmount;
    }
    public static double calSalary(double comAmount, double netSold)
    {
        double salary = comAmount + 2000;
        return salary;
    }
    public static void displayValues(int toWidgetsSold, int toWidgetsReturned, int netSold, double widSalesAmt, double comAmount, double salary)
    {
        System.out.println("Sales Person: Aiden Canady");
        System.out.println("Total Widgets Sold: " + toWidgetsSold);
        System.out.println("Total Widgets Returned: " + toWidgetsReturned);
        System.out.println("Net Widgets Sold: " + netSold);
        System.out.println("Widget Sales Amount: " + widSalesAmt);
        System.out.println("Comission Amount: " + comAmount);
        System.out.println("Monthly Salary: " + salary);
    }
    // create your functions/methods here
    
}
