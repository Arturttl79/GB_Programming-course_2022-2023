package Products;

/**
 * Базовый класс бутылки с водой
 */

public class BottleOfWater extends Product {

    /** объем бутылки с водой */
    private int volume;

    /**
     * конструктор бутыли с водой 3 параметра
     * @param name это название бутылки с водой
     * @param price это цена бутылки
     * @param volume это объем бутылки
     */
    public BottleOfWater(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    /** получаем объем бутылки */
    public int getVolume() {
        return volume;
    }

    /**
     * устанавливаем новый объем бутылки с водой
     * @param volume новый объем бутылки
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /** переопределяем метод toString для бутылки с водой */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + "\'" +
                ", cost=" + super.getPrice() +
                "руб., volume=" + volume + "мл.}";
    }
}
