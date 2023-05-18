package Controller;

import java.util.*;

// import Model.Model;
import Model.Student;
// import View.View;

/* Обрабатывает запросы от View и передаёт в работу в Model.
При MVP обрабатывает также ответы Model и передаёт во View. */
public class Controller {

    private HashMap<Long, Student> students;
    private iGetView view;
    private iGetModel model;

    /* Конструктор. Связывает view и model */
	public Controller(iGetView view, iGetModel model) {
		this.view = view;
		this.model = model;
        this.students = new HashMap<>();
	}

    /* Геттер. Берёт данные о студентах от Модели и кладёт их себе */
    public void getAllStudent() {
        students = model.getAllStudent();    
    }

    /* Функция контроля данных, поступающих из Модели */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* Этот метод запрашивает view, чтобы вывести нужные данные  */
    public void updateView() {
        //MVC
        //view.printAllStudent(model.getAllStudent());

        //MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        } else {
            System.out.println("The list of students is empty!");
        }
    }

    /* Метод для удаления данных студента по номеру ID студента */
    public void deleteStudent() {
        Long numberOfStudentToDelete = Long.parseLong(view.prompt("Enter the number of student to be deleted: "));
        model.removeStudentByNumber(numberOfStudentToDelete);
        getAllStudent();
    }

    /* Метод, который перехватывает команды от пользователя */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Enter the command:\n* LIST - to show all the students in the list;\n* DELETE - to delete the student from the list by Student ID;\n* EXIT - to exit the program.");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit from the program!");
                    break;
                case LIST:
                    //getAllStudent();
                    updateView();    
                    break;
                case DELETE:
                    deleteStudent();
                    updateView();
                    break;
                default:
                    break;
            }
        }
    }
}
