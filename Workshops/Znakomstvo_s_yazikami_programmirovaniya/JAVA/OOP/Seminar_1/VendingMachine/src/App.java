import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product item1 = new Product("Арахис", 40.0);
        item1.setPrice(35.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachine.addProduct(new BottleOfWater("Никола", 60.0, 330));
        itemMachine.addProduct(new BottleOfWater("БонАква", 90.0, 1000));
        itemMachine.addProduct(new HotDrink("Кофе 3в1", 45.0, 150, 90));
        itemMachine.addProduct(new HotDrink("Черный чай", 30.0, 200, 80));
        itemMachine.addProduct(new HotDrink("Зеленый чай", 30.0, 200, 85));
        itemMachine.addProduct(new HotDrink("Кипяченая вода", 5.0, 200, 95));
        
        for (Product prod : itemMachine.getProdAll()) {
            System.out.println(prod);
        }
    }
}
