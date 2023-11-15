package seminar2_task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

/*
- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
- Проверить, что объект Car создается с 4-мя колесами.
- Проверить, что объект Motorcycle создается с 2-мя колесами.
- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
*/

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Land Cruiser", 2020);
        motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020);
    }

    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void testCarIsInstanceOfVehicle() {

        assertTrue(car instanceof Vehicle); // JUnit
        assertThat(car).isInstanceOf(Vehicle.class); // AssertJ
    }

    @Test
    @DisplayName("Объект Car создается с 4-мя колесами")
    void testCarWeels() {

        assertEquals(car.getNumWheels(), 4); // JUnit
        assertThat(car.getNumWheels()).isEqualTo(4); // AssertJ
    }

    @Test
    @DisplayName("Объект Motorcycle создается с 2-мя колесами")
    void testMotorcycleWeels() {

        assertEquals(motorcycle.getNumWheels(), 2); // JUnit
        assertThat(motorcycle.getNumWheels()).isEqualTo(2); // AssertJ
    }

    @Test
    @DisplayName("Объект Car развивает скорость 60 в режиме тестового вождения")
    void testCarTestDriveSpeed() {

        car.testDrive();
        assertEquals(car.getSpeed(), 60); // JUnit
        assertThat(car.getSpeed()).isEqualTo(60); // AssertJ
    }

    @Test
    @DisplayName("Объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    void testMotorcycleTestDriveSpeed() {

        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75); // JUnit
        assertThat(motorcycle.getSpeed()).isEqualTo(75); // AssertJ
    }

    @Test
    @DisplayName("Объект Car в режиме парковки останавливается")
    void testCarParkSpeed() {

        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0); // JUnit
        assertThat(car.getSpeed()).isEqualTo(0); // AssertJ
    }

    @Test
    @DisplayName("Объект Motorcycle в режиме парковки останавливается")
    void testMotorcycleParkSpeed() {

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0); // JUnit
        assertThat(motorcycle.getSpeed()).isEqualTo(0); // AssertJ
    }
}