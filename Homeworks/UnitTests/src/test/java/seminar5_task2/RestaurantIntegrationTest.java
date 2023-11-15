package seminar5_task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantIntegrationTest {

    @Test
    public void testRestaurantIntegration() {

        // Создаем блюда
        MenuItem burger = new MenuItem("Бургер", 5.99);
        MenuItem pizza = new MenuItem("Пицца", 7.99);

        // Создаем заказ
        Order order = new Order();
        order.addItem(burger);
        order.addItem(pizza);

        // Создаем кухню
        Kitchen kitchen = new Kitchen();

        // Отправляем заказ на кухню
        kitchen.prepareOrder(order);

        // Получаем готовый заказ
        List<MenuItem> preparedItems = order.getItems();

        // Проверяем, что заказ был правильно приготовлен
        assertEquals(2, preparedItems.size());
        assertEquals("Бургер", preparedItems.get(0).getName());
        assertEquals(5.99, preparedItems.get(0).getPrice(), 0.001);
        assertEquals("Пицца", preparedItems.get(1).getName());
        assertEquals(7.99, preparedItems.get(1).getPrice(), 0.001);
    }
}