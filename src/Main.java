import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     boolean validValue = false;
     double metricMeters = 0;
     double metricMiles;
     double metricFeet;
     double metricInches;
     final double METERS_TO_MILES = 0.00062137;
     final double METERS_TO_FEET = 3.28084;
     final double METERS_TO_INCHES = 39.37008;

     do {
         System.out.println("Enter meter value");
         if (scan.hasNextDouble()) {
             metricMeters = scan.nextDouble();
             if (metricMeters > 0) {
                 validValue = true;
             } else {
                 System.out.println("you have entered an invalid value try again!");
             }
         } else {
             System.out.println("you have entered an invalid value try again");
         }
         scan.nextLine();
     }while(!validValue);

     metricMiles = metricMeters * METERS_TO_MILES;
     metricFeet = metricMeters * METERS_TO_FEET;
     metricInches = metricMeters * METERS_TO_INCHES;

     System.out.printf("%-10s %10.2f", "Meters:", metricMeters);
     System.out.printf("\n%-10s %10.2f", "Miles:", metricMiles);
     System.out.printf("\n%-10s %10.2f", "Feet:", metricFeet);
     System.out.printf("\n%-10s %10.2f", "Inches:", metricInches);

    }
}