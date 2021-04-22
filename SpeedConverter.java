public class SpeedConverter {
    //Created a method
    public static long toMilesPerHour(double kilometersPerHour) {

        //checking if the value is positive
        if (kilometersPerHour < 0) {
            return -1;
        }

        //if the value is positive returning it after converting it to miles.
        return Math.round(kilometersPerHour / 1.609);

    }

    //Creating a second method
    public static void printConversion(double kiloMetersPerHour) {

        if (kiloMetersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kiloMetersPerHour);
            System.out.println(kiloMetersPerHour + " km/h= " + milesPerHour + " mi/h");
        }
    }
}



