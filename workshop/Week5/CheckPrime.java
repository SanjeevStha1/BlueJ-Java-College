package workshop.Week5;
import java.util.Scanner;


/**
 * Write a description of class CheckPrime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckPrime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isDivisible = false;
        while( isDivisible == false)
        {
            for(int i = 2; i<=9; i++)
            {
                if(n==i)
                {
                    continue;
                }
                if(n%i == 0)
                {
                    isDivisible = true;
                }
            }
        }
        if(isDivisible == false)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
        
    
}