public class MyCircle {
    int r;

    public MyCircle(int r) {
        this.r = r;
    }

    public double obwod (int r) {
        return 2 * r * Math.PI;
    }

    public double pole (int r) {
        return Math.PI * r * r;
    }

    public double srednica (int r) {
        return 2 * r;
    }
}
