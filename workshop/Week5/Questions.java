package workshop.Week5;


/**
 * Write a description of class Questions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Questions
{
    public static void main(String[]args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*i);
        }
        int oddSum = 0;
        int evenSum = 0;
        for (int j=1;j<=10;j++)
        {
            if(j%2==0)
            {
                oddSum +=j;
                
            }
            else
            {
                evenSum +=j;
                
            }
        }
        System.out.println("The sum of odd numbers upto 10 is: "+oddSum);
        System.out.println("The sum of even numbers upto 10 is: "+evenSum);
        
    }
}