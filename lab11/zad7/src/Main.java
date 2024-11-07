import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words would you like to enter?");
        int num = sc.nextInt();
        sc.nextLine();
        String[] words = new String[num];
        System.out.println("Now enter your words: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(wordsOfEvenLength(words)));
    }

    public static String[] wordsOfEvenLength(String[] words) {
        ArrayList<String> evenLengthWords = new ArrayList<>();

        for (String word : words) {
            if ((word.length() % 2 == 0)) {
                evenLengthWords.add(word);
            }
        }

        return evenLengthWords.toArray(new String[0]);
    }
}