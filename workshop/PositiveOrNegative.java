package workshop;
import java.util.Scanner;


/**
 * Write a description of class PositiveOrNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveOrNegative
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("The number is zero. ");
        }
        else if(num>0) {
            System.out.println(" The number is positive. ");
        }
        else{
            System.out.println(" The number is negative. ");
        }    
    }

}