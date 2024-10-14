import java.util.Random;

class Moneta {
    public String rzut() {
        Random random = new Random();
        int wynik = random.nextInt(2);
        return wynik == 0 ? "Orzeł" : "Reszka";
    }
}