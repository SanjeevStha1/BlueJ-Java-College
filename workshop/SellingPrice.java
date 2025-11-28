package Workshop;
import java.util.Scanner;


/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marked price: ");
        float mp = sc.nextFloat();
        System.out.println("Enter the category of the item: ");
        char category = sc.next().charAt(0);
        double sp;
        if (category == 'A')
        {
            sp = mp - (mp * 0.6);
            System.out.println("The Selling Price is: "+ sp);
        }
        else if(category =='B')
        {
            sp = mp - (mp * 0.4);
            System.out.println("The Selling Price is: "+ sp);
        }
        else if(category =='C')
        {
            sp = mp - (mp * 0.2);
            System.out.println("The Selling Price is: "+ sp);
        }
        else if(category =='D')
        {
            sp = mp - (mp * 0.1);
            System.out.println("The Selling Price is: "+ sp);
        }
        else{
            System.out.println("Invalid Category.");
        }
    }
}