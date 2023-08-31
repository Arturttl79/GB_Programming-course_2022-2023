package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Gold;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;

public class GoldRewards implements IGameItem {

    @Override
    public String open() {
        return "Gold";
    }
}
