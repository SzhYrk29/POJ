public class Punkt {
    int x, y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double obliczOdleglosc (int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double obliczOdleglosc2 (Punkt punkt) {
        return Math.sqrt(Math.pow(this.x - punkt.x, 2) + Math.pow(this.y - punkt.y, 2));
    }
}
