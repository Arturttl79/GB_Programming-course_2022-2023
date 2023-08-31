package Homeworks.SoftwareArchitecture.Lesson_2.Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Homeworks.SoftwareArchitecture.Lesson_2.Abstractions.ItemGenerator;
import Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Cash.CashGenerator;
import Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Diamond.DiamondGenerator;
import Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Gold.GoldGenerator;
import Homeworks.SoftwareArchitecture.Lesson_2.Rewards.Silver.SilverGenerator;

public class Core {

    // Логика игры

    public static Scanner scanner = new Scanner(System.in);

    public void run() {

        int totalCount = 0;
        int cashCount = 0;
        int silverCount = 0;
        int goldCount = 0;
        int diamondCount = 0;
        int choosenNumber;

        Random random = new Random();

        List<ItemGenerator> generatorList = new ArrayList<>();
        List<ItemGenerator> rewardsList = new ArrayList<>();

        // Шанс выигрыша валюты = 40%.
        generatorList.add(new CashGenerator());
        generatorList.add(new CashGenerator());
        generatorList.add(new CashGenerator());
        generatorList.add(new CashGenerator());

        // Шанс выигрыша серебра = 30%.
        generatorList.add(new SilverGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new SilverGenerator());

        // Шанс выигрыша золота = 20%.
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());

        // Шанс выигрыша бриллианта = 10%.
        generatorList.add(new DiamondGenerator());

        System.out.print("Игра началась! ");

        while (true) {
            System.out.println("Введите номер сундука, который хотите открыть (1, 2 или 3): ");
            while (true) {
                try {
                    choosenNumber = Integer.parseInt(scanner.nextLine());
                    if (choosenNumber >= 1 && choosenNumber <= 3) {
                        break;
                    } else {
                        System.out.println("Введите число в диапазоне от 1 до 3: ");
                    }
                } catch (Exception e) {
                    System.out.println("К сожалению Вы ввели не число. Попробуйте заново выбрать номер сундука: ");
                }
            }

            ItemGenerator myGenerator = generatorList.get(random.nextInt(generatorList.size()));
            rewardsList.add(myGenerator);

            System.out.println("У вас вышло: " + myGenerator.openReward());
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("На данный момент у вас в копилке следующие награды: " + rewardsList);
            System.out.println("---------------------------------------------------------------------------");

            while (true) {
                try {
                    System.out.println("Хотите продолжить игру? (1 - Да, 0 - нет)");
                    choosenNumber = Integer.parseInt(scanner.nextLine());
                    if (choosenNumber != 1 && choosenNumber != 0) {
                        System.out.print("Введите '1' для продолжения или '0' для выхода из игры. ");
                    } else
                        break;
                } catch (Exception e) {
                    System.out.print("К сожалению Вы ввели не число. Попробуйте заново. ");
                }
            }

            if (choosenNumber == 0) {

                for (int i = 0; i < rewardsList.size(); i++) {
                    if (rewardsList.get(i).toString() == "Cash") {
                        cashCount++;
                    } else if (rewardsList.get(i).toString() == "Diamond") {
                        diamondCount++;
                    } else if (rewardsList.get(i).toString() == "Gold") {
                        goldCount++;
                    } else {
                        silverCount++;
                    }
                    totalCount++;
                }
                System.out.println(cashCount + silverCount + goldCount + diamondCount + totalCount);
                System.out.println("Вы завладели следующими наградами: ");
                System.out.println("---------------------------------------------------------------------------");
                // System.out.printf(- Наличка = %n штук 100$ купюр (%n % от общего кол-ва наград);\n,\n- Золото = %n слитков (%n % от общего кол-ва наград),\n- Брилианты = %n камушек (%n % от общего кол-ва наград)", cashCount, cashCount, silverCount, silverCount, goldCount, goldCount, diamondCount, diamondCount);
                System.out.printf("- Наличка = %d штук '100$' купюр (%d процент от общего кол-ва наград)\n", cashCount, 100*cashCount/totalCount);
                System.out.printf("- Серебро = %d слитков (%d процент от общего кол-ва наград)\n", silverCount, 100*silverCount/totalCount);
                System.out.printf("- Золото = %d слитков (%d процент от общего кол-ва наград)\n", goldCount, 100*goldCount/totalCount);
                System.out.printf("- Брилианты = %d камушек (%d процент от общего кол-ва наград)\n", diamondCount, 100*diamondCount/totalCount);
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("\t\t\tДо встречи на следующей игре!");
                System.out.println("---------------------------------------------------------------------------");
                break;
            }
        }

    }
}
