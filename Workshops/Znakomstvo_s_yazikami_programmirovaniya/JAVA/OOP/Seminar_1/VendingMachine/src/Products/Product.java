package Products;

/**
 * Базовый класс продукта
 */

public class Product {

    /** наименование продукта */
    private String name;
    /** цена продукта */
    private Double price;

    /**
     * конструктор продукта 2 параметра
     * @param name это наименование продукта
     * @param price это цена продукта
     */
    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    /**
     * конструктор продукта 1 параметр
     * @param name это наименование продукта
     */
    public Product(String name) {
        this.name = name;
    }
    
    /** получаем наименование продукта */
    public String getName() {
        return name;
    }

    /** получаем цену продукта */
    public Double getPrice() {
        return price;
    }

    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(Double value) {
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        this.price = value;
    }

    /** переопределяем метод toString для продукта */
    @Override
    public String toString() {
        return "Product{" + "name='" + name + "\'" + 
        ", cost=" + price + "руб.}";
    }
}
