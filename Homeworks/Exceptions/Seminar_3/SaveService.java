package Homeworks.Exceptions.Seminar_3;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class SaveService {

    public static void save(Human human) throws SaveException {

        Date startDate = new Date();
        System.out.println("Сохранение данных в файл запущено: " + startDate);

        try (FileWriter fileWriter = new FileWriter(new File(human.lastName + ".txt"), true)) {
            fileWriter.write(String.valueOf(human));
            System.out.println("Сохранение данных в файл успешно завершено!");
        } catch (Exception e) {
            throw new SaveException(e);
        }
    }
}
