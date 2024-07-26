import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("NWD: " + euklides(a, b));
    }

    public static double euklides (int a, int b) {
        int NWD = 0;
        while (true) {
            if (a == 0 || b == 0) {
                break;
            } else if (a>b) {
                a %= b;
            } else {
                b %= a;
            }

            if (a == 0) {
                NWD = b;
            } else {
                NWD = a;
            }
        }
        return NWD;
    }
}