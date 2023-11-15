package seminar2_task2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Product product) {
        cartItems.add(product);
    }

    public void removeItem(Product product) {
        cartItems.remove(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product item : cartItems) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}