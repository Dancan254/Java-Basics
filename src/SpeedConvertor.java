import java.util.Scanner;

/**
 *
 */
public class SpeedConvertor {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter speed in kmh: ");
        double kmh = sn.nextDouble();
        //System.out.println(kmh + "km is = " +  Math.round(toMilesPerHour(kmh))+ "mph");
        
        printConversion(kmh);
    }

    //to miles per hour
    static double toMilesPerHour(double kmph){
        if (kmph < 1){
            return -1;
        }
        else {
            return (int) kmph / 1.609;
        }
    }

    //method to milesPerHour from the kilometersPerHour parameter.
    static void printConversion(double kmph){
        if (kmph < 0){
            System.out.println("Invalid value");
        }
        else{
            int mph = (int) Math.round(((int) kmph / 1.609));

            System.out.println(kmph + "km/h = " + mph + " mi/h");
        }
    }
}
