package seminar2_task2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Другие методы
}