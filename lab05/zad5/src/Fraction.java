public class Fraction {
    int licznik;
    int mianownik;

    public Fraction(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public void addition(Fraction fraction) {
        this.licznik = this.licznik * fraction.mianownik + fraction.licznik * this.mianownik;
        this.mianownik *= fraction.licznik;
    }

    public void subtraction(Fraction fraction) {
        this.licznik = this.licznik * fraction.mianownik - fraction.licznik * this.mianownik;
        this.mianownik *= fraction.licznik;
    }

    public void multiplication(Fraction fraction) {
        this.licznik *= fraction.licznik;
        this.mianownik *= fraction.licznik;
    }

    public void division(Fraction fraction) {
        this.licznik *=fraction.mianownik;
        this.mianownik *=fraction.licznik;
    }

    public void skrocenie() {
        int a = this.licznik;
        int b = this.mianownik;
        int nwd;

        while (a * b != 0) {
            if (a >= b) {
                a %= this.mianownik;
            } else {
                b %= this.licznik;
            }
        }
        nwd = a + b;
        this.licznik /= nwd;
        this.mianownik /= nwd;
    }

    public String toString() {
        return this.licznik + "/" + this.mianownik;
    }
}
