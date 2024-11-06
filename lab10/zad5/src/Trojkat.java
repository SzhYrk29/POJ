public class Trojkat implements Figura, Comparable {
    private int a;
    private int b;
    private int c;
    private int h;

    public Trojkat(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (a * h) / 2;
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }
}
