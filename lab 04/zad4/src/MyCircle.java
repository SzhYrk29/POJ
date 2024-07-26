public class MyCircle {
    public int radius;

    public MyCircle(int radius) {
        this.radius = radius;
    }

    public double ObliczObwod(int radius) {
        return Math.PI * radius * 2;
    }

    public double ObliczPole(int radius) {
        return radius * radius * Math.PI;
    }

    public double ObliczSrednice(int radius) {
        return radius * 2;
    }
}
