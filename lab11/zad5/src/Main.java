import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countLetters(str));
    }

    public static Map<String, Integer> countLetters(String str) {
        Map<String, Integer> result = new HashMap<>();

        String regex = "[euioa]";

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]", "");
        String[] letters = str.split("");
        List<String> vowels = new ArrayList<>();
        List<String> consonants = new ArrayList<>();
        for (String letter : letters) {
            if (letter.matches(regex)) {
                vowels.add(letter);
            } else {
                consonants.add(letter);
            }
        }

        result.put("vowels", vowels.size());
        result.put("consonants", consonants.size());

        return result;
    }
}