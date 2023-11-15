package seminar1_task5;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        List<Product> sortedList = new ArrayList<>(this.products);
        sortedList.sort(new ProductComparator());
        return sortedList;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        List<Product> sortedList = this.sortProductsByPrice();
        return sortedList.get(sortedList.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : this.products) {
            stringBuilder.append(product.getTitle()+", цена: "+product.getCost());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
