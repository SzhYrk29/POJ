public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point center = new Point(3, 4);

        Circle circle = new Circle(center, 7);

        System.out.println(circle.czyWewnatrz(point1));
    }
}