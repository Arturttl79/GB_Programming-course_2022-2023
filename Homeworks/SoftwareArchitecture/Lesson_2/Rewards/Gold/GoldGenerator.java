package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Gold;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;
import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}
