public class Point {
    //instance variables
    private int x;
    private int y;

    //constructor 1 (no parameters)
    public Point() {

    }

    //constructor 2
    public Point(int x, int y) {
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

    //no parameters
    //it needs to return the distance between this Point and Point (0, 0) as a double
    public double distance(){
        return this.distance(0, 0);
    }

    /*
     1 parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double
     */
    public double distance(Point point2) {
        return this.distance(point2.getX(), point2.getY());
    }

    /*
         two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double
     */

    //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance(int x, int y){
        double x2 = Math.pow( (x - this.getX()), 2);
        double y2 = Math.pow( (y - this.getY()), 2 );
        return Math.sqrt((x2) + y2);
    }
}
