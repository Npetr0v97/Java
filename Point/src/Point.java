public class Point {

    private int x;
    private int y;

    public Point() {

        this(0,0);
    }

    public Point (int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {

        return Math.sqrt(Math.abs(Math.pow(x,2)) + Math.abs(Math.pow(y,2)));
    }

    public double distance(int x, int y) {



        return Math.sqrt(Math.abs(Math.pow(this.x-x,2)) + Math.abs((Math.pow(this.y-y,2))));
    }

    public double distance(Point point){

        return Math.sqrt(Math.abs(Math.pow(this.x-point.getX(),2)) + Math.abs((Math.pow(this.y- point.getY(),2))));
    }
}
