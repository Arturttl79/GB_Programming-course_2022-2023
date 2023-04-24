package Products;

/**
 * Базовый класс горячего напитка
 */

public class HotDrink extends Product {
    
    /** температура горячего напитка */
    private int temperature;
    /** объем горячего напитка */
    private int volume;

    /**
     * конструктор горячего напитка
     * @param name это название напитка
     * @param price это цена напитка
     * @param volume это объем напитка
     * @param temperature это температура напитка
     */
    public HotDrink(String name, Double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    /** получаем объем напитка */
    public int getVolume() {
        return volume;
    }

    /**
     * устанавливаем новый объем напитка
     * @param volume новый объем напитка
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /** получаем температуру напитка */
    public int getTemp() {
        return temperature;
    }

    /**
     * устанавливаем новую температуру напитка
     * @param temperature новая температура напитка
     */
    public void setTemp(int temperature) {
        this.temperature = temperature;
    }

    /** переопределяем метод toString для горячего напитка */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + "\'" +
                ", cost=" + super.getPrice() +
                "руб., volume=" + volume + 
                "мл., temperature=" + temperature + "С}";
    }
}
