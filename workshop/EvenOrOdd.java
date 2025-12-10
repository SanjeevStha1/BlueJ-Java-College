package workshop;
import java.util.Scanner;


/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("The number is zero. ");
        }
        else if(num%2 == 0) {
            System.out.println(" The number is even. ");
        }
        else{
            System.out.println(" The number is odd. ");
        }    
    }
}