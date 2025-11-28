package week4;
import java.util.Scanner;

/**
 * Write a description of class CalculatorUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorUsingSwitch
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator as +,-,*,/,% : ");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+': 
                System.out.println("The sum is: "+ (num1 + num2));
                break;
            case '-': 
                System.out.println("The difference is: "+ (num1 - num2));
                break;
            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The quotient is: " + (num1 / num2));
                break;
            case '%':
                System.out.println("The remainder is: " + (num1 % num2));
                break;
            default:
                System.out.println("Inappropriate Operator");
        }
    }
}