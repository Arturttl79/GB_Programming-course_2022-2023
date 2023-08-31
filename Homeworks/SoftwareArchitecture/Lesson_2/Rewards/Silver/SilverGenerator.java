package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Silver;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;
import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.ItemGenerator;

public class SilverGenerator extends ItemGenerator {
   
    @Override
    public IGameItem createItem() {
        return new SilverRewards();
    } 
}
