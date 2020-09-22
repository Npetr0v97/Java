public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;
        }

        double area = width * height;
        int neededBuckets;

        if (areaPerBucket * extraBuckets >= area) {

            return 0;
        } else {

            neededBuckets = (int)((area - areaPerBucket * extraBuckets) / areaPerBucket) + 1;

            return neededBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {

            return -1;
        }

        double area = width * height;
        int neededBuckets;


        neededBuckets = (int)(area / areaPerBucket ) + 1;

        return neededBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area<= 0 || areaPerBucket <= 0) {

            return -1;
        }

        int neededBuckets;


        neededBuckets = (int)(area / areaPerBucket ) + 1;

        return neededBuckets;
    }
}
