import java.util.Scanner;

/**
 * Write a description of class Tutorial5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial5
{
    public static void main(String[]args)
    {
        // for(int i=1;i<=10;i++)
        // {
            // if(i%2==0)
            // {
                // System.out.print(i+ "\t");
            // }
        // }
        // int n = 10;
        // while(n>0)
        // {
            // System.out.println(n+"\n");
            // n--;
        // }
        //Restaurant Management System.
        // Scanner sc = new Scanner(System.in);
        // int choice;
        // int quantity;
        // int billTotal=0;
        // do
        // {
            // System.out.println(" Restaurant Menu ");
            // System.out.println(" 1: Pizza 500");
            // System.out.println(" 2: Mo:Mo 300");
            // System.out.println(" 3: Burger 400");
            // System.out.println(" 0: Bill");
            // System.out.println("Enter your choice: ");
            // choice = sc.nextInt();
            // switch(choice)
            // {
                // case 1:
                    // System.out.println("You have chose pizza.");
                    // System.out.print("Enter the quantity: "); 
                    // quantity = sc.nextInt();
                    // billTotal +=(500*quantity);
                    // break;
                // case 2:
                    // System.out.println("You have chose Mo:Mo.");
                    // System.out.print("Enter the quantity: "); 
                    // quantity = sc.nextInt();
                    // billTotal +=(300*quantity);
                    // break;
                // case 3:
                    // System.out.println("You have chose Burger.");
                    // System.out.print("Enter the quantity: "); 
                    // quantity = sc.nextInt();
                    // billTotal += (400*quantity);
                    // break;
                // case 0:
                    // System.out.println("Your total bill is: Rs. "+billTotal); 
                    // System.out.println("Thank You For Your Order.");
                    // break;
                // default:
                    // System.out.println("Invalid Input");
            // }
        // }while(choice!=0);
        
        
        //Pattern Example
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}