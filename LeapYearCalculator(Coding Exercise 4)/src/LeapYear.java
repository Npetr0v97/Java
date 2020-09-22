public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    return true;
                } else {

                    return false;
                }
            } else {

                return true;
            }
        } else {

            return false;
        }

    }

    public static void printLeapYear(int year) {

        boolean isLeapYear = LeapYear.isLeapYear(year);

        if (isLeapYear) {

            System.out.println(year + " is a Leap Year");
        } else {

            System.out.println(year + " is not a Leap Year");
        }
    }
}
