package workshop.Week5;
import java.util.Scanner;


/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int quotient = num;
        int rev = 0;
        int rem;
        while (quotient!=0)
        {
            rem = quotient%10;
            rev = rev *10 + rem;
            quotient = quotient/10;
            
        }
        System.out.println("The reverse of the given number is: "+rev);
        if (num==rev)
        {
            System.out.println("The number is palindrome.");
        }
        else
        {
            System.out.println("The number is not palindrome.");
        }
    }
}