package seminar5_task2;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий элемент меню
public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


