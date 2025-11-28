package Workshop;
import java.util.Scanner;

/**
 * Write a description of class Cinema here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cinema
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Movie Language(English/Hindi): ");
        String language = sc.next().toLowerCase();
        System.out.print("Are you Student?(Yes/No) ");
        String student = sc.next().toLowerCase();
        System.out.print("Are there any festivals nearby?(Yes/No) ");
        String festival = sc.next().toLowerCase();
        double ticketPrice = 0;
        if(age<18)
        {
            ticketPrice += 150;
            if(language.equals("english"))
            {
                ticketPrice +=100;
                if(student.equals("yes"))
                {
                    ticketPrice -= (0.2*ticketPrice);
                    if(festival.equals("yes"))
                    {
                        ticketPrice -= (0.15*ticketPrice);
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                    else{
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else if(language.equals("hindi"))
            {
                ticketPrice +=50;
                if(student.equals("yes"))
                {
                    ticketPrice -= (0.2*ticketPrice);
                    if(festival.equals("yes"))
                    {
                        ticketPrice -= (0.15*ticketPrice);
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                    else{
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else if((age>=18)&&(age<30))
        {
            ticketPrice += 250;
            if(language.equals("english"))
            {
                ticketPrice +=100;
                if(student.equals("yes"))
                {
                    ticketPrice -= (0.2*ticketPrice);
                    if(festival.equals("yes"))
                    {
                        ticketPrice -= (0.15*ticketPrice);
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                    else{
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else if(language.equals("hindi"))
            {
                ticketPrice +=50;
                if(student.equals("yes"))
                {
                    ticketPrice -= (0.2*ticketPrice);
                    if(festival.equals("yes"))
                    {
                        ticketPrice -= (0.15*ticketPrice);
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                    else{
                        System.out.println("The total Price is: "+ ticketPrice);
                    }
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else{
                System.out.println("Invalid Input.");
            }
        }
        else
        {
            ticketPrice += 200;
            if(language.equals("english"))
            {
                ticketPrice +=100;
                if(festival.equals("yes"))
                {
                    ticketPrice -= (0.15*ticketPrice);
                    System.out.println("The total Price is: "+ ticketPrice);
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else if(language.equals("hindi"))
            {
                ticketPrice +=50;
                if(festival.equals("yes"))
                {
                    ticketPrice -= (0.15*ticketPrice);
                    System.out.println("The total Price is: "+ ticketPrice);
                }
                else{
                    System.out.println("The total Price is: "+ ticketPrice);
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }

    }
}
