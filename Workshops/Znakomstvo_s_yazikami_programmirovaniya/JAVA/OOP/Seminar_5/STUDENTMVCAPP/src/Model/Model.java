package Model;

import java.util.*;

import Controller.iGetModel;

/* Модуль работает с данными */
public class Model implements iGetModel {
	/* Объявляем хэш-список, куда будем помещать студентов. В Long - номер ID студента, в Student - данные студента */
    private HashMap<Long, Student> students;

	/* Конструктор */
	public Model(HashMap<Long, Student> students) {
		this.students = students;
	}

	/* Геттер. Возвращает список всех студентов */
	@Override
    public HashMap<Long, Student> getAllStudent() {
		return students;
	}

	/* Удаляем студента, зная его ID. Переопределяем метод из интерфейса iModel */
	@Override
	public void removeStudentByNumber(Long numberOfStud) {
		if (!students.keySet().contains(numberOfStud)) {
			System.out.println("There`s no student with specified number!\n");
		} else {
			students.keySet().removeIf(number -> number.equals(numberOfStud));
		}
	}
}
