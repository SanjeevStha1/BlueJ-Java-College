
import java.util.Scanner;

/**
 * Write a description of class FareCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FareCalculator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int baseFare = 20;
        int perKmCharge = 10;
        int perMinCharge = 2;
        float localDiscountRate = 0.2f; //applicable if distance > 10km.
        float nightExtraChargeRate = 0.1f;
        System.out.print("How much was distance of trip? ");
        double distance = sc.nextDouble();
        System.out.print("How long was the trip in minutes? ");
        double time = sc.nextDouble();
        System.out.print("Are you local?(true/false) ");
        boolean isLocal  = sc.nextBoolean();
        System.out.print("Is it nighttime?(true/false) ");
        boolean isNight = sc.nextBoolean();
        double totalCharge = 0.0;
        totalCharge = perKmCharge*distance + perMinCharge*time;
        totalCharge = (isNight)? (totalCharge+0.1* totalCharge) : (totalCharge);
        totalCharge = totalCharge+baseFare;
        totalCharge = (isLocal&& distance>10.0)? (totalCharge-0.2* totalCharge): (totalCharge);
        System.out.println("Your total fare is: Nrs"+ totalCharge);
        
    }
}