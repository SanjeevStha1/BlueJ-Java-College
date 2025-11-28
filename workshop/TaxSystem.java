package Workshop;
import java.util.Scanner;


/**
 * Write a description of class TaxSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxSystem
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the annual income: ");
        int income = sc.nextInt();
        double tax;
        if(income<=500000)
        {
            tax = income * 0.1;
            System.out.println("Tax amount to pay is: "+ tax);
        }
        else if((income>500000)&&(income<700000))
        {
            tax = 5000 + 0.1*(income-500000);
            System.out.println("Tax amount to pay is: "+ tax);
        }
        else if((income>700000)&&(income<1000000))
        {
            tax = 15000 + 0.2*(income-500000);
            System.out.println("Tax amount to pay is: "+ tax);
        }
        else if((income>1000000)&&(income<2000000))
        {
            tax = 35000 + 0.3*(income-500000);
            System.out.println("Tax amount to pay is: "+ tax);
        }
        else if((income>2000000)&&(income<5000000))
        {
            tax = 335000 + 0.36*(income-500000);
            System.out.println("Tax amount to pay is: "+ tax);
        }
        else
        {
            tax = 1135000 + 0.39*(income-500000);
            System.out.println("Tax amount to pay is: "+ tax);
        }
    }
}