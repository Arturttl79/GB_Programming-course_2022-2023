package Homeworks.SoftwareArchitecture.Lesson_3.src;

//методы: движение, обслуживание, переключение передач, включение фар дворников.

public class Car implements ICar {
    protected String mark, model, color, exter, fuel_type, control;
    protected int num_wheels;
    protected double vol_eng;

    public Car(String mark, String model, String color, String exter, String fuel_type, String control, int num_wheels, double vol_eng) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.exter = exter;
        this.fuel_type = fuel_type;
        this.control = control;
        this.num_wheels = num_wheels;
        this.vol_eng = vol_eng;
    }

    protected String movement() {
        return "";
    }

    protected String service() {
        return "";
    }

    public void changeControl(String control_mode) {
    }

    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return false;
    }

    @Override
    public void isLight_on(boolean is_light) {
        is_light = true;
    }
}
