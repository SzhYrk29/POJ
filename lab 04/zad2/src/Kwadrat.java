public class Kwadrat {
    public int bok;

    public Kwadrat (int bok) {
        this.bok = bok;
    }

    public int ObliczObwod() {
        return bok*4;
    }

    public int ObliczPole() {
        return bok*bok;
    }
}
