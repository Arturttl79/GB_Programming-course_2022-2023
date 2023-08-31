package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Cash;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;
import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.ItemGenerator;

public class CashGenerator extends ItemGenerator {
    
    @Override
    public IGameItem createItem() {
        return new CashRewards();
    }
}
