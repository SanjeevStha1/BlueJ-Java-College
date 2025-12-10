package workshop.Week5;


/**
 * Write a description of class Divisibleby7and9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisibleby7and9
{
    public static void main(String[]args)
    {
        for(int i = 1; i<=100; i++)
        {
            if(i%7==0)
            {
                if(i%9==0)
                {
                    System.out.println(i+" is the first number divisible by both 7 and 9.");
                    break;
                }
            }
            
        }
        for(int i =1;i<100;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            if(i%13==0)
            {
                break;
            }
        }
        
    }
}