package seminar1_task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product productA = new Product();
        productA.setTitle("Колбаса");
        productA.setCost(100);

        Product productB = new Product();
        productB.setTitle("Молоко");
        productB.setCost(80);

        Product productC = new Product();
        productC.setTitle("Творог");
        productC.setCost(90);

        productList.add(productA);
        productList.add(productB);
        productList.add(productC);

        Shop shop = new Shop();
        shop.setProducts(productList);

        System.out.println("Изначальный набор продуктов: ");
        System.out.println(shop);

        System.out.println("Сортировка продуктов по цене: ");
        //productList.sort(new ProductComparator());
        List<Product> sortedProductList = shop.sortProductsByPrice();
        for (Product product : sortedProductList)
            System.out.println(product);
        System.out.println();

        System.out.println("Самый дорогой продукт: ");
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        System.out.println(mostExpensiveProduct);
    }
}
