public class AreaCalculator {

    public static double area(double radius) {

        if (radius < 0) {

            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {

            return -1;
        }

        return x * y;
    }

    public static void printResults(double x, double y, double radius) {

        double areaC = area(radius);
        double areaT = area(x,y);

        System.out.println("Area C = " + areaC + " / Area T = " + areaT);
    }
}
