import java.util.ArrayList;
import java.util.Arrays;

public class Bookshop extends Shop {

    ArrayList<String> products = new ArrayList<>(Arrays.asList("Harry Potter", "Lord of the Rings", "The Witcher", "Charlie and The Chocolate Factory", "The Adverntures of Tom Sawyer"));

    public Bookshop (String address, int size) {
        super(address, size);
    }

    @Override
    void getInformation() {
        System.out.println("Address: " + address
                + "\nSize: " + size + "\nProducts: " + products);
    }
}
