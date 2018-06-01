public class ShapeMain {
    public static void main(String[] args) {
        Circle O = new Circle(5);
        System.out.println(O.area());
        System.out.println(O.perimeter());

        Rectangle R = new Rectangle(2, 3);
        System.out.println(R.area());
        System.out.println(R.perimeter());

        Triangle T = new Triangle(4, 2, 3);
        System.out.println(T.area());
        System.out.println(T.perimeter());
    }
}
