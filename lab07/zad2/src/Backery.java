import java.util.ArrayList;
import java.util.Arrays;

public class Backery extends Shop {
    ArrayList<String> products = new ArrayList<>(Arrays.asList("Cake", "Bread", "Precel", "Cookie", "Bagel"));

    public Backery (String address, int size) {
        super(address, size);
    }

    @Override
    void getInformation() {
        System.out.println("Address: " + address
        + "\nSize: " + size + "\nProducts: " + products);
    }
}
