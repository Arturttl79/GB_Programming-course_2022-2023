package Homeworks.SoftwareArchitecture.Lesson_3.src.FuelStation;
// Заправочная станция

public interface IFuelStation {

    // Заправка топливом
    void refuel();

    // Методы протирки лобового стекла, фар и зеркал перенёс в отдельный интерфейс IFuelStationCleaning
}
