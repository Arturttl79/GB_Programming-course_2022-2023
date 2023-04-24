package VendingMachines;

/**
 * Базовый класс вендинг машины
 */

import java.util.*;
import Products.Product;

public class VendingMachine {

    /** вместимость вендинг машины */
    private int volume;
    /** лист продуктов внутри вендинг машины */
    private List<Product> products; // = new ArrayList<Product>(null);
    /** лист записей по выдаче товаров вендинг машиной */
    private List<String> workLog; // = new ArrayList<String>(null);

    /**
     * конструктор вендинг машины
     * @param volume это вместимость вендинг машины
     */
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    /**
     * добавляем новый продукт в вендинг машину
     * @param prod продукт для добавления
     */
    public void addProduct(Product prod) {
        products.add(prod);
    }

    /**
     * добавляем название продукта в лист записей по выдаче товаров вендинг машиной
     * @param line название продукта(может быть указано еще кол-во и дата продажи)
     */
    public void addSales(String line) {
        workLog.add(line);
    }

    /**
     * получаем продукт по названию
     * @param name название для поиска необходимого продукта
     */
    public Product getProdByName(String name) {
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }    
        }
        return null;
    }

    /** получаем лист всех продуктов, содержащихся в вендинг машине */
    public List<Product> getProdAll() {
        return products;
    }

    /** получаем вместимость вендинг машины */
    public int getVolume() {
        return volume;
    }
}
