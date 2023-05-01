package Controllers;

import StudentDomain.Teacher;
import StudentDomain.User;
import StudentService.TeacherService;

/** Базовый класс TeacherСontroller. Имплементирует интерфейс iUserСontroller */
public class TeacherController implements iUserController<Teacher> {
    
    /** Конечное поле teacherService. Инкапсулировано */
    private final TeacherService teacherService = new TeacherService();

    /** Переопределенный метод для создания экземпляра класса TeacherService */
    @Override
    public void create(String firstName, String lastName, int age) {
        teacherService.create(firstName, lastName, age);
    }

    /** Статический метод для указания оплаты заработной платы для определенного учителя */
    static public <T extends Teacher> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 15000р ");
    }
}
