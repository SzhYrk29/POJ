import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        System.out.println(dublicates(list));
        System.out.println(deleteDuplicates(list));
    }

    public static List<Integer> dublicates (List<Integer> list) {
        List<Integer> dublicates = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                dublicates.add(list.get(i));
            }
        }
        return dublicates;
    }

    public static List<Integer> deleteDuplicates (List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i);
            }
        }
        return list;
    }
}