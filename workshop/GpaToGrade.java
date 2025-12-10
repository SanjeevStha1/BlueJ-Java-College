package workshop;
import java.util.Scanner;


/**
 * Write a description of class GpaToGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GpaToGrade
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA: ");
        double gpa = sc.nextDouble();
        if((gpa>0.00) && (gpa<4.00))
        {
            if(gpa>=3.60){
                System.out.println("You got A+.");
            }
            else if((gpa>=3.20)&&(gpa<3.60))
            {
                System.out.println("You got A.");
            }
            else if((gpa>=2.80)&&(gpa<3.20))
            {
                System.out.println("You got B+.");
            }
            else if((gpa>=2.40)&&(gpa<2.80))
            {
                System.out.println("You got B.");
            }
            else
            {
                System.out.println("You got below B. Work Harder!!");
            }
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}