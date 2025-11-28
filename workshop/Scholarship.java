package Workshop;
import java.util.Scanner;


/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Enter the attendance in percentage: ");
        double attendance = sc.nextDouble();
        System.out.print("Enter attitude score(1-10)");
        int attitude = sc.nextInt();
        if(gpa>=3.20)
        {
            if(attendance>80.0)
            {
                if(attitude>5)
                {
                    System.out.print("You are eligible for scholarship.");
                }
                else
                {
                    System.out.print("Improve your attitude to be eligible. ");
                }
            }
            else
            {
                System.out.print("Be regular on the class to be eligible.");
            }
        }
        else
        {
            System.out.print("Study harder and get good gpa to be eligible.");
        }
    }
}