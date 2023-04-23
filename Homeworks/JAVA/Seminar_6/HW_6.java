package Homeworks.JAVA.Seminar_6;

import java.util.*;

public class HW_6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    Laptop Laptop1 = new Laptop("Apple", "MacBook Pro 13", 8, 256, "MacOS", "silver", "New");
    Laptop Laptop2 = new Laptop("Dell", "M5001SR Max", 4, 128, "Windows", "black", "Used");
    Laptop Laptop3 = new Laptop("Asus", "23421SKJihjlasd", 2, 512, "Windows", "white", "New");
    Laptop Laptop4 = new Laptop("Apple", "MacBook Air 14", 16, 512, "MacOS", "blue", "New");
    Laptop Laptop5 = new Laptop("Huawei", "zji12j Mini Pro", 32, 1024, "Windows", "orange", "New");
    Laptop Laptop6 = new Laptop("Xiaomi", "Mi10S Pro Max", 2, 2048, "Windows", "grey", "Used");
    
    ArrayList<Laptop> laptopList = new ArrayList<>();
    laptopList.add(Laptop1);
    laptopList.add(Laptop2);
    laptopList.add(Laptop3);
    laptopList.add(Laptop4);
    laptopList.add(Laptop5);
    laptopList.add(Laptop6);

    showAllLaptopList(laptopList);
    filteredList(laptopList);
    }
    
    public static void showAllLaptopList(ArrayList<Laptop> laptopList) {
        for (int i = 0; i < laptopList.size(); i++) {
            laptopList.get(i).showLaptopCharacteristics(laptopList.get(i));
        }
    }

    public static void filteredList(ArrayList<Laptop> laptopList) {
        Map<String, String> criteria = new HashMap<>();
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Производитель\n6 - Состояние");
            int inputKey = scanner.nextInt();
            System.out.println("Введите минимальное значение для объема или значение для других параметров");
            switch (inputKey) {
                case 1:
                    criteria.put("ram", Integer.toString(scanner.nextInt()));
                    break;
                case 2:
                    criteria.put("rom", Integer.toString(scanner.nextInt()));
                    break;
                case 3:
                    criteria.put("os", scanner.next());
                    break;
                case 4:
                    criteria.put("color", scanner.next());
                    break;
                case 5:
                    criteria.put("manufacturer", scanner.next());
                    break;
                case 6:
                    criteria.put("condition", scanner.next());
                    break;
                default:
                    System.out.println("Ввели неверное значение. Повторите ввод.");
                    break;
            }
            System.out.println("Желаете добавить дополнительные критерии? (1 - да, 0 - нет.)");
            if (scanner.nextInt() == 0) break;
        }
        System.out.println("Список ноутбуков согласно заданным фильтрам");
        for (int i = 0; i < laptopList.size(); i++) {
            if (criteria.get("ram") == null || Integer.parseInt(criteria.get("ram")) <= laptopList.get(i).ram) {
                if (criteria.get("rom") == null || Integer.parseInt(criteria.get("rom")) <= laptopList.get(i).rom) {
                    if (criteria.get("os") == null || criteria.get("os").toLowerCase().contains(laptopList.get(i).os.toLowerCase())) {
                        if (criteria.get("color") == null || criteria.get("color").toLowerCase().contains(laptopList.get(i).color.toLowerCase())) {
                            if (criteria.get("manufacturer") == null || criteria.get("manufacturer").toLowerCase().contains(laptopList.get(i).manufacturer.toLowerCase())) {
                                if (criteria.get("condition") == null || criteria.get("condition").toLowerCase().contains(laptopList.get(i).condition.toLowerCase())) {                             
                                    laptopList.get(i).showLaptopCharacteristics(laptopList.get(i));
                                }
                            }
                        }
                    }    
                }
            }
        }
    }  
}
