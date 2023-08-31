package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Silver;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;

public class SilverRewards implements IGameItem {
   
    @Override
    public String open() {
        return "Silver";
    }
}
