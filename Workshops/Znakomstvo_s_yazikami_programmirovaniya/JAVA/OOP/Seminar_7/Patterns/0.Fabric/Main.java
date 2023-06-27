import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        
        for (int i = 0; i < 10; i++) {
            ItemGenerator itemGenerator = generatorList.get(0);
            itemGenerator.openReward();
        }
    }
}