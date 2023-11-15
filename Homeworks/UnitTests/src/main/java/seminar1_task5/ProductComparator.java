package seminar1_task5;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getCost() > product2.getCost())
            return 1;
        if (product1.getCost() < product2.getCost())
            return -1;
        return 0;
    }
}
