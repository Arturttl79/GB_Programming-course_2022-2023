package seminar5_task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolIntegrationTest {

    @Test
    public void testSchoolIntegration() {

        // Задание:
        // 1. Создайте учебное заведение (School).

        School school = new School();

        // 2. Добавьте преподавателя (Леонид) и студентов (Роман, Сергей, Алина, Максим, Александр, Олег, Инна) в учебное заведение.

        Person person1 = new Person("Леонид", true);
        Person person2 = new Person("Роман", false);
        Person person3 = new Person("Сергей", false);
        Person person4 = new Person("Алина", false);
        Person person5 = new Person("Максим", false);
        Person person6 = new Person("Александр", false);
        Person person7 = new Person("Олег", false);
        Person person8 = new Person("Инна", false);

        school.addPerson(person1);
        school.addPerson(person2);
        school.addPerson(person3);
        school.addPerson(person4);
        school.addPerson(person5);
        school.addPerson(person6);
        school.addPerson(person7);
        school.addPerson(person8);

        // 3. Проверьте, что Леонид является преподавателем в учебном заведении.

        //Boolean isTeacher = school.isTeacherInSchool("Леонид");

        assertTrue(school.isTeacherInSchool("Леонид"));

        // 4. Проверьте, что Роман является студентом в учебном заведении.

        assertTrue(school.isStudentInSchool("Роман"));

        // 5. Попробуйте добавить ещё одного студента и убедитесь, что он также является студентом в учебном заведении.

        Person person9 = new Person("Ринат", false);
        school.addPerson(person9);
        assertTrue(school.isStudentInSchool("Ринат"));
        assertFalse(school.isTeacherInSchool("Ринат"));
    }
}