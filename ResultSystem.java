
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage you got: ");
        double percent = sc.nextDouble();
        if (percent>=90)
        {
            System.out.println("You got Distinction. Congrats!!");
        }
        else if ((percent>=70)&&(percent<90))
        {
            System.out.println("You got First Division. Good Work!!");
        }
        else if((percent>=50)&&(percent<70))
        {
            System.out.println("You got Second Divison.");
        }
        else if((percent>=40)&&(percent<50))
        {
            System.out.println("You got Third Divison. Work Harder!!");
        }
        else
        {
            System.out.println("You Failed. Disappointing!!");
        }
    }
}