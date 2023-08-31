package Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Cash;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.IGameItem;

public class CashRewards implements IGameItem {

    @Override
    public String open() {
        return "Cash";
    }
}
