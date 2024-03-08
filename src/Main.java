public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        System.out.println(point1.distance(4, 5));


        Point point2 = new Point(3, 4);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance());
    }
}