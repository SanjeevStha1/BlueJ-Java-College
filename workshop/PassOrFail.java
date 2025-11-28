package Workshop;
import java.util.Scanner;


/**
 * Write a description of class PassOrFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassOrFail
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yours marks: ");
        double marks = sc.nextDouble();
        if (marks>=40)
        {
            System.out.println("You have passed the examination.");
        }
        else
        {
            System.out.println("You have failed the examination.");
        }
    }
}