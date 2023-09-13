package Homeworks.SoftwareArchitecture.Lesson_3.src;

/*
Спроектировать абстрактный класс «Cars.Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
Создать конкретный автомобиль путём наследования класса «Cars.Car».
Расширить абстрактный класс «Cars.Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования класса «Cars.Car». Провести проверку принципа SRP.
Расширить абстрактный класс «Cars.Car», добавить метод: включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
Создать конкретный автомобиль путём наследования класса «Cars.Car», определить число колёс = 3. Провести проверку принципа LSP.
*/

import Homeworks.SoftwareArchitecture.Lesson_3.src.Cars.Kamaz;
import Homeworks.SoftwareArchitecture.Lesson_3.src.Cars.Toyota;

public class Main {
    public static void main(String[] args) {

        // К задаче 2:

        // Toyota toyota = new Toyota("Camry", "blue", "sedan", "petrol", "auto", 4, 2.5);
        // Core.run(toyota);

        // К задачам 3 и 4:

        //Kamaz kamaz = new Kamaz("StreetCleaner", "orange", "track", "diesel", "manual", 6, 6);
        //Core.run(kamaz);

        // К задаче 5:

        //Toyota toyota = new Toyota("Camry", "blue", "sedan", "petrol", "auto", 3, 2.5);
        //Core.run(toyota);

        // К задаче 11:

        Toyota toyota = new Toyota("Camry", "blue", "sedan", "petrol", "auto", 3, 2.5);
        Kamaz kamaz = new Kamaz("StreetCleaner", "orange", "track", "diesel", "manual", 6, 6);

        toyota.refuel();
        kamaz.refuel();
    }
}