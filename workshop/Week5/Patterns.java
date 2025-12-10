package workshop.Week5;


/**
 * Write a description of class Patterns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patterns
{
    public static void main(String[]args)
    {
        System.out.println("Pattern 1");
        for(int i=5;i>0;i--)
        {
            for(int j = 5;j>=i;j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println("Pattern 2");
        for (int k=1;k<=5;k++)
        {
            for(int l = 1; l<=k;l++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        System.out.println("Pattern 3");
        for (int k=1;k<=5;k++)
        {
            for(int l = 5; l>=k;l--)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}