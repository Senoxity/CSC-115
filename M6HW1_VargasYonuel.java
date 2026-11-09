/**
 * Yonuel Vargas
 * 11/24/2024
 * M6HW1
 * This program calculates the gross pay for an employee based on hours worked and pay rate.
 */

 import java.util.Scanner;

 public class M6HW1_VargasYonuel{
     public static void main(String[] args) {
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
 }
 