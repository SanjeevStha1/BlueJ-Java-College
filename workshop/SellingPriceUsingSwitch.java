package Workshop;
import java.util.Scanner;


/**
 * Write a description of class SellingPriceUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceUsingSwitch
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marked price: ");
        double mp = sc.nextDouble();
        System.out.println("Enter the category of the item: ");
        char category = sc.next().charAt(0);
        double sp;
        switch(category)
        {
            case 'A':
                sp = mp - (mp * 0.6);
                System.out.println("The Selling Price is: "+ sp);
                break;
            case 'B':
                sp = mp - (mp * 0.4);
                System.out.println("The Selling Price is: "+ sp);
                break;
            case 'C':
                sp = mp - (mp * 0.2);
                System.out.println("The Selling Price is: "+ sp);
                break;
            case 'D':
                sp = mp - (mp * 0.1);
                System.out.println("The Selling Price is: "+ sp);
                break;
            default:
                System.out.println("Invalid Category.");
                
        }
    }   
}