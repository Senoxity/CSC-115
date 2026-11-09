import java.util.Scanner;

/**
 * M5HW1_CanadyAiden
 */
public class M5HW1_CanadyAiden 
{

    public static void main(String[] args) 
    {
        double average;
        String run = "yes";
        char lettergrade;
        int grade, count, num = 0, total = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("How many grades will you enter? ");
        count = k.nextInt();
        while (run.equalsIgnoreCase("yes"))
        {
            do
            {
                num++;
                System.out.println("Enter grade #" + num + ": ");
                grade = k.nextInt();
                while (grade < 0 || grade > 100)
                {
                    System.out.println("Invalid grade!");
                    System.out.println("Grades must be from 0 to 100.");
                    System.out.println("Enter grade #" + num + "again: ");
                }
                total = total + grade;
            }
            while (num < count);
            average = total / count;
        
            if (average >= 90)
                {
                    lettergrade = 'A';
                }
            else if (average >= 80)
                {
                    lettergrade = 'B';
                }
            else if (average >= 70)
                {
                    lettergrade = 'C';
                }
            else if (average >= 60)
                {
                    lettergrade = 'D';
                }
            else
                {
                    lettergrade = 'F';
                }
            
            System.out.println("Your average grade is " + lettergrade);
            System.out.println("Would you like to run the program again? ");
            run = k.next();
        }
        k.close();
    }
}