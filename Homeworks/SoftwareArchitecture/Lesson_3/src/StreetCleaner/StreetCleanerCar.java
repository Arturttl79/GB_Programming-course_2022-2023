package Homeworks.SoftwareArchitecture.Lesson_3.src.StreetCleaner;

// Функция подметания улицы
public class StreetCleanerCar {

    private boolean isCleaningStreet = false; // Указатель, подметает ли машина улицу в данный момент

    public void cleanStreet(boolean isCleaningStreet) {

        if (this.isCleaningStreet == isCleaningStreet) {
            System.out.println("Машина и так "+(isCleaningStreet ? "уже подметает улицу" : "не подметает улицу")+".");
            return;
        }

        this.isCleaningStreet = isCleaningStreet;
        System.out.println("Машина "+(isCleaningStreet ? "подметает улицу" : "не подметает улицу")+".");
    }

    @Override
    public String toString() {
        return "Функция уборки улиц: "+(this.isCleaningStreet ? "включена" : "выключена");
    }
}
