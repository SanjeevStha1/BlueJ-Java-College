package workshop.Week5;
import java.util.Scanner;


/**
 * Write a description of class OddEvenCount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEvenCount
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int oddCount = 0;
        int evenCount =0;
        int quotient;
        int zeroCount = 0;
        int rem;
        do 
        {
            rem = num%10;
            quotient = num/10;
            if (rem%2==0)
            {
                evenCount +=1;
            }
            else if (rem %2 != 0)
            {
                oddCount+=1;
            }
            
            num = quotient;
        }while(quotient!=0);
        System.out.println("The number of odd numbers is: "+oddCount);
        System.out.println("The number of even numbers is: "+evenCount);
        
    }
}