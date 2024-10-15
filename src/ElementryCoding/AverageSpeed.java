package ElementryCoding;

public class AverageSpeed {
    /*
    (Average speed in kilometers) Assume a runner runs 24 miles
    in 1 hour, 40 minutes, and 35 seconds. Write a program that
    displays the average speed in kilometers per hour.
    (Note that 1 mile is 1.6 kilometers.)
    Key information:

    Distance: The runner runs 24 miles.
    Time: The runner takes 1 hour, 40 minutes, and 35 seconds.
    Conversion Factor: 1 mile = 1.6 kilometers.
    Goal: Calculate the average speed in kilometers per hour.
    */

    public static void main(String[] args) {

        // Step 1: Declare variables for the distance and time
        double miles = 24; // distance in miles
        double kilometers = miles * 1.6; // convert miles to kilometers (1 mile = 1.6 km)

        // Time: 1 hour, 40 minutes, and 35 seconds
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        // Step 2: Convert the time to total hours
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Step 3: Calculate the average speed in kilometers per hour
        double averageSpeed = kilometers / totalTimeInHours;

        // Step 4: Display the result
        System.out.println("The average speed is " + averageSpeed + " kilometers per hour.");

    }
}
