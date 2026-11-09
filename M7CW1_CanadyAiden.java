/**
 * M7CW1_CanadyAiden
 */
import java.util.Scanner;
public class M7CW1_CanadyAiden {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        runMenu(in);
    }
    public static void runMenu(Scanner in)
    {
        
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayValues();
                // all calls to your function/methods should come from runProgram()  method only
                
                int SideA = getSideA(in);
                int SideB = getSideB(in);
                int area = calArea(SideA,SideB);
                double hypotenuse = calHypotenuse(SideA,SideB);
                displayValues(SideA, SideB, area, hypotenuse);
                
                System.out.println();
                System.out.print("Do you want to run the program again? Enter y or n: ");
                keep_going = in.next();
                System.out.println();
            }
    in.close();
    System.out.println("Program has terminated!");
    }
    public static void display()
    {
        System.out.println();
        System.out.println("Your name");
        System.out.println();
        

    }
    public static int getSideA(Scanner in )
    {
       System.out.print("Enter side A of the right triangle: ");
        int SideA = in.nextInt();
       return SideA; 
    }
    public static int getSideB(Scanner in )
    {
       System.out.print("Enter side B of the right triangle: ");
        int SideB = in.nextInt();
       return SideB; 
    }
    public static int calArea( int a, int b )
    {
       return (a*b)*2; 
    }
    public static double calHypotenuse( double a, double b )
    {
        // hypotenuse must be double in the Math.hypot() function so values are received as double not integers
        // this function has no errors
       return Math.hypot(a, b); 
       
    }
    public static double displayValues(SideA,SideB,area,hypotenuse)
    {
        System.out.println();
        System.out.println("Side A is " , sideA);
        System.out.println("Side B is " ,sideB);
        System.out.println("Area is ",area);
        System.out.println("Hypotenuse is ", hypotenuse);
        System.out.println();
    }

}