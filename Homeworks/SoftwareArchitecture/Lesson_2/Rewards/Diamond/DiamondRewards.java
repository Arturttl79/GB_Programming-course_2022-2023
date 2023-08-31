package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Diamond;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;

public class DiamondRewards implements IGameItem {
    
    @Override
    public String open() {
        return "Diamond";
    }
}
