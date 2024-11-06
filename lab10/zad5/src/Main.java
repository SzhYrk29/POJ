import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(4);
        Kwadrat kwadrat = new Kwadrat(4);
        Trojkat trojkat = new Trojkat(2, 2, 2, 4);

        Figura[] figuras = {kolo, kwadrat, trojkat};

        Arrays.sort(figuras);
        for (Figura figura : figuras) {
            System.out.println("Pole: " + figura.obliczPole());
            System.out.println("Obwód: " + figura.obliczObwod());
            System.out.println();
        }
    }
}