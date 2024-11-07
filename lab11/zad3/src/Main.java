import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(countWords(text));
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> result = new HashMap<>();
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z ]", "");
        String[] words = text.split(" ");

        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                int value = result.get(word);
                value += value;
                result.replace(word, value);
            }
        }
        return result;
    }
}