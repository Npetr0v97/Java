public class TeenNumberChecker {

    public static boolean hasTeen(int firstTeenAge, int secondTeenAge, int thirdTeenAge) {

        if ((firstTeenAge>=13 && firstTeenAge<=19) || (secondTeenAge>=13 && secondTeenAge<=19) ||
                (thirdTeenAge>=13 && thirdTeenAge<=19)) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean isTeen(int firstTeenAge) {

        if (firstTeenAge>=13 && firstTeenAge<=19) {

            return true;
        } else {

            return false;
        }
    }

    public static void printResult(int firstTeenAge, int secondTeenAge, int thirdTeenAge) {

        boolean teenCheck = hasTeen(firstTeenAge,secondTeenAge,thirdTeenAge);

        if (teenCheck) {

            System.out.println("At least one of the kids is a teen");
        } else {

            System.out.println("NONE of the kids are teens");
        }
    }

    public static void printResultIsTeen(int firstTeenAge) {

        boolean teenCheck = isTeen(firstTeenAge);

        if (teenCheck) {

            System.out.println("The kid is a teen");
        } else {

            System.out.println("The kid is NOT a teen");
        }
    }
}
