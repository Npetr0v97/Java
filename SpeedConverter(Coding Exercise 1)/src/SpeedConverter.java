public class SpeedConverter {

    public static long toMilesPerHour(double kilometers) {

        if (kilometers < 0){

            return -1;
        }

        return Math.round(kilometers / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            System.out.println("Invalid Value");
        } else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
