package workshop.Week5;


/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String[]args)
    {
        int firstNum = 1;
        int secondNum = 1;
        System.out.println(firstNum);
        for(int i = 1; i<=10;i++)
        {
            int sum = firstNum+secondNum;
            System.out.println(sum);
            firstNum = secondNum;
            secondNum = sum;
            
        }
    }
}