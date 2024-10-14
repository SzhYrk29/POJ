import static java.lang.Math.pow;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean czyWewnatrz (Point point) {
        return Math.sqrt(pow(this.center.getX() - point.getX(), 2) + pow(this.center.getY() - point.getY(), 2)) <= this.radius;
    }
}
