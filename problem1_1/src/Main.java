public class Main {

    public static void main(String[] args) {

        long second = 1_000_000l;
        long minute = second * 60l;
        long hour = minute * 60l;
        long day = hour * 24l;
        long month = day * 30l;
        long year = day * 365l;
        long century = year * 100l;

        System.out.println(century);

        long mlseconds = 1l;
        boolean print=false;

        while (Math.log(mlseconds) < second) {


            mlseconds++;
        }
        System.out.println("For one second you can execute "+ mlseconds + " actions");

    }
}
