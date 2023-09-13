package Homeworks.SoftwareArchitecture.Lesson_3.src.Cars;

import Homeworks.SoftwareArchitecture.Lesson_3.src.FogLights.FogLightsCar;
import Homeworks.SoftwareArchitecture.Lesson_3.src.FogLights.IFogLightsCar;
import Homeworks.SoftwareArchitecture.Lesson_3.src.FuelStation.IFuelStation;
import Homeworks.SoftwareArchitecture.Lesson_3.src.StreetCleaner.IStreetCleanerCar;
import Homeworks.SoftwareArchitecture.Lesson_3.src.StreetCleaner.StreetCleanerCar;
import Homeworks.SoftwareArchitecture.Lesson_3.src.Cargo.ICargoCar;
import Homeworks.SoftwareArchitecture.Lesson_3.src.Cargo.CargoCar;

public class Kamaz extends Car
        implements
            IStreetCleanerCar, IFogLightsCar, ICargoCar,
            IFuelStation {

    static String make = "Камаз";
    private StreetCleanerCar streetCleanerCar;
    private FogLightsCar fogLightsCar;
    private CargoCar cargoCar;

    public Kamaz(String model, String color, String bodyType, String fuelType, String transmissionType, int numWeels, double engineVol) {
        super(make, model, color, bodyType, fuelType, transmissionType, numWeels, engineVol);
        streetCleanerCar = new StreetCleanerCar();
        fogLightsCar = new FogLightsCar();
        cargoCar = new CargoCar();
    }

    public void cleanStreet(boolean isCleaningStreet) {
        streetCleanerCar.cleanStreet(isCleaningStreet);
    }

    public void fogLights(boolean fogLightIsOn) {
        fogLightsCar.fogLights(fogLightIsOn);
    }

    public void cargo(boolean isCargo) {
        cargoCar.cargo(isCargo);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                streetCleanerCar.toString() + "\n" +
                fogLightsCar.toString() + "\n" +
                cargoCar.toString();
    }

    @Override
    public void refuel() {
        System.out.println("Машина "+this.make+" заправилась топливом "+this.fuelType);
    }
}
