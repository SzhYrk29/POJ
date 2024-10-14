import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String reversed = reverse(line);
        System.out.println(reversed);
    }

    public static String reverse (String line) {
        char[] text = line.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length - 1; i >= 0; i--) {
            reversed.append(text[i]);
        }
        return reversed.toString();
    }
}