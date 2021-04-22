public class Main {

    public static void main(String[] args) {

        //Calling the 1st method and printing its value
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        //Calling the second method and analyzing its result.
        SpeedConverter.printConversion(10.5);
    }
}
