package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
// import java.io.IOException;
import java.util.*;

import Controller.iGetModel;

/* То же, что и Model - та же функция, но Модель работает с памятью, а FileRepo - с файлами */
public class FileRepo implements iGetModel {
    /* Название файла, где хранятся данные */
    private String fileName;
    /* Объявляем хэш-список, куда будем помещать студентов. В Long - номер ID студента, в Student - данные студента */
    private HashMap<Long, Student> students;

    /* Конструктор */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new HashMap<>();
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* Метод добавления студентов в HashMap */
    public void addStudent(Student student) {
        this.students.put(student.getStudID(), student);
    }

    /* Чтение данных студентов из файла */
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.put(pers.getStudID(), pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* Сохранение данных студентов в файл */
    public void saveAllStudentToFile() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student pers : students.values()) {
                // students.forEach((number, pers) -> {
                fw.write(pers.getFirstName() + " " + pers.getLastName() + " " + pers.getAge() + " " + pers.getStudID());
                fw.append('\n');
                // try {
                // fw.write(pers.getFirstName() + " " + pers.getLastName() + " " + pers.getAge()
                // + " " + pers.getStudID());
                // fw.append('\n');
                // } catch (IOException e) {
                // e.printStackTrace();
                // }
            };
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* Переопределяем метод из интерфейса iModel */
    @Override
    public HashMap<Long, Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

    /* Удаляем студента, зная его ID. Переопределяем метод из интерфейса iModel */
    @Override
    public void removeStudentByNumber(Long numberOfStud) {
        if (!students.keySet().contains(numberOfStud)) {
            System.out.println("There`s no student with specified number!\n");
        }
        students.keySet().removeIf(number -> number.equals(numberOfStud));
        try (PrintWriter wr = new PrintWriter(fileName)) {
            wr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Student student : students.values()) {
            addStudent(student);
        }
        saveAllStudentToFile();
	}
}