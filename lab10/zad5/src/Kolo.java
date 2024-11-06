public class Kolo implements Figura, Comparable {
    private int r;

    public Kolo (int r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }

}
