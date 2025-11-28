import java.util.Scanner;

/**
 * Write a description of class TimeConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeConverter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds/3600;
        int remainder = seconds%3600;
        int minutes = remainder/60;
        int remainder2 = remainder%60;
        int remainingSeconds = remainder2;
        System.out.println(hours+" hours "+ minutes +" minutes "+remainingSeconds +" seconds.");
        
        
        
        
    }
}