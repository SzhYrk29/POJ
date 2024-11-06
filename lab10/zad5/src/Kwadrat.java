public class Kwadrat implements Figura, Comparable {
    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        return Math.pow(a, 2);
    }

    @Override
    public double obliczObwod() {
        return Math.pow(a, 4);
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }
}
