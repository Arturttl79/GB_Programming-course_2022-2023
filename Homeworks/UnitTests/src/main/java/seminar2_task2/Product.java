package seminar2_task2;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public double getQuantity() {
        return this.quantity;
    }
    // Геттеры и сеттеры
}