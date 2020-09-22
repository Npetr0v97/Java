public class Functions {

    public static boolean calculations(long mlseconds){

        long second = 1_000_000l;
        long minute = second * 60l;
        long hour = minute * 60l;
        long day = hour * 24l;
        long month = day * 30l;
        long year = day * 365l;
        long century = year * 100l;

        if (Math.log(mlseconds) >= second) {

            System.out.println("For one second you can execute "+ mlseconds + " actions");
            return true;
        }

        return false;
    }
}
