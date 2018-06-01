public class PointMain {
    static double PI = 3.14;

    public static void main(String[] args){
        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(1, 2, 3);

        System.out.println(p3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.equals(p2));
        System.out.println(p1.midPoint(p2));

        p1.setLocation(3, 2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
