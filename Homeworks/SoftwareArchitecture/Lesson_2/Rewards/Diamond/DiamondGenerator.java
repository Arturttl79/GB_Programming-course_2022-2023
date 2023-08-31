package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Diamond;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;
import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.ItemGenerator;

public class DiamondGenerator extends ItemGenerator {
    
    @Override
    public IGameItem createItem() {
        return new DiamondRewards();
    }
}
