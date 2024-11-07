import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();


        System.out.println(countLetters(text));
    }

    public static Map<String, Set<Integer>> countLetters(String text) {
        Map<String, Set<Integer>> result = new HashMap<>();
        text = text.replaceAll("[^A-Za-z]", "");
        System.out.println(text);
        String[] letters = text.split("");

        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            result.putIfAbsent(letter, new HashSet<>());
            result.get(letter).add(i);
        }
        return result;
    }
}