import java.util.*;

import StudentDomain.Student;
import StudentDomain.StudentCourse;
import StudentDomain.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {

        Student s11 = new Student("Сергей", "Иванов", 22, 111);
        Student s12 = new Student("Андрей", "Сидоров", 22, 112);
        Student s13 = new Student("Иван", "Петров", 21, 113);
        Student s14 = new Student("Игорь", "Иванов", 21, 114);
        Student s15 = new Student("Даша", "Цветкова", 22, 115);
        Student s16 = new Student("Елена", "Незабудкина", 21, 116);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s11);
        listStud1.add(s12);
        listStud1.add(s13);
        listStud1.add(s14);
        listStud1.add(s15);
        listStud1.add(s16);

        Student s21 = new Student("Вася", "Пупкин", 23, 121);
        Student s22 = new Student("Егор", "Андреев", 23, 122);
        Student s23 = new Student("Иван", "Мишин", 22, 123);
        Student s24 = new Student("Игорь", "Луговой", 22, 124);
        Student s25 = new Student("Даша", "Белова", 23, 125);
        Student s26 = new Student("Елена", "Забудкина", 22, 126);
        Student s27 = new Student("Алина", "Будкина", 22, 127);
        Student s28 = new Student("Вера", "Чернова", 23, 128);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s21);
        listStud2.add(s22);
        listStud2.add(s23);
        listStud2.add(s24);
        listStud2.add(s25);
        listStud2.add(s26);
        listStud2.add(s27);
        listStud2.add(s28);

        Student s31 = new Student("Рубэн", "Иванов", 24, 131);
        Student s32 = new Student("Анатолий", "Сидоров", 24, 132);
        Student s33 = new Student("Валентин", "Петров", 23, 133);
        Student s34 = new Student("Алмаз", "Иванов", 23, 134);
        Student s35 = new Student("Маша", "Цветкова", 24, 135);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s31);
        listStud3.add(s32);
        listStud3.add(s33);
        listStud3.add(s34);
        listStud3.add(s35);

        Student s41 = new Student("Сергей", "Петров", 25, 141);
        Student s42 = new Student("Андрей", "Харитян", 25, 142);
        Student s43 = new Student("Иван", "Пашинян", 24, 143);
        Student s44 = new Student("Игорь", "Вартанян", 24, 144);
        Student s45 = new Student("Даша", "Цветканян", 25, 145);
        Student s46 = new Student("Елена", "Незабудканян", 24, 146);
        Student s47 = new Student("Елена", "Бабич", 24, 147);

        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s41);
        listStud4.add(s42);
        listStud4.add(s43);
        listStud4.add(s44);
        listStud4.add(s45);
        listStud4.add(s46);
        listStud4.add(s47);

        StudentGroup group1 = new StudentGroup(listStud1);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);
        StudentGroup group4 = new StudentGroup(listStud4);

        List<StudentGroup> listGroups = new ArrayList<StudentGroup>();
        listGroups.add(group1);
        listGroups.add(group2);
        listGroups.add(group3);
        listGroups.add(group4);
        StudentCourse groups = new StudentCourse(listGroups);

        for (StudentGroup studentGroup : groups) {
            System.out.println(studentGroup);
        }

        System.out.println("\n============= после сортировки =============");

        Collections.sort(groups.getGroups());

        for (StudentGroup studentGroup : groups) {
            System.out.println(studentGroup);
        }

        // Collections.sort(group1.getStudents());

        // for (Student student : group1) {
        //     System.out.println(student);
        // }

        // System.out.println(u1);
        // System.out.println(s1);
    }
}
