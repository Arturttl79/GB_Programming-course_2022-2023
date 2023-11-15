package seminar1_task5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    private Shop shop;
    private Product product1;
    private Product product2;
    private Product product3;

    // Формируем состав продуктов, чтобы потом на нём производить тесты
    @BeforeEach
    void setUp() {

        List<Product> productList = new ArrayList<>();
        product1 = new Product();
        product1.setTitle("Колбаса");
        product1.setCost(100);

        product2 = new Product();
        product2.setTitle("Молоко");
        product2.setCost(80);

        product3 = new Product();
        product3.setTitle("Творог");
        product3.setCost(90);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        shop = new Shop();
        shop.setProducts(productList);
    }

    @Test
    @DisplayName("Магазин хранит верное количество продуктов")
    void testProductList() {
        assertThat(shop.getProducts().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Верность сортировки продуктов по цене")
    void testSortProductList() {

        List<Product> sortedProductList = new ArrayList<>();

        sortedProductList.add(product2);
        sortedProductList.add(product3);
        sortedProductList.add(product1);

        // JUnit
        assertEquals(shop.sortProductsByPrice(), sortedProductList);

        // AssertJ
        assertThat(shop.sortProductsByPrice()).isEqualTo(sortedProductList);
    }

    @Test
    @DisplayName("Верность выбора самого дорогого продукта")
    void testMostExpensiveProduct() {

        Product mostExpensiveProduct = product1;

        // JUnit
        assertEquals(shop.getMostExpensiveProduct(), mostExpensiveProduct);

        // AssertJ
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(mostExpensiveProduct);
    }
}
