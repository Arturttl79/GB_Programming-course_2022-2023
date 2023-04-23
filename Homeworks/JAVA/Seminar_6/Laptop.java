package Homeworks.JAVA.Seminar_6;

import java.util.HashMap;
import java.util.Map;

public class Laptop {
    public String manufacturer;
    public String model;
    public int ram;
    public int rom;
    public String os;
    public String color;
    public String condition;
    public Map<String, Integer> searchCriteria = new HashMap<>();

    public Laptop(String manufacturer, String model, int ram, int rom, String os, String color, String condition) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
        this.condition = condition;
    }

    void showLaptopCharacteristics(Laptop n) {
            System.out.print("Manufacturer: " + n.manufacturer + ";\t");
            System.out.print("Model: " + n.model + ";\t");
            System.out.print("RAM volume: " + n.ram + ";\t");
            System.out.print("ROM volume: " + n.rom + ";\t");
            System.out.print("Operating System: " + n.os + ";\t");
            System.out.print("Color: " + n.color + "; \t");
            System.out.println("Condition: " + n.condition + ";\n");
    }

    // public void getListByCriteria(laptopList);
}
