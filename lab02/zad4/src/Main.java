import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        boolean a = true;

        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                a = false;
                break;
            }
        }

        if (a) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
