import java.util.*;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEnglish;

public class App {
    public static void main(String[] args) throws Exception {
        
        // List<Student> students = new ArrayList<>();
        HashMap<Long, Student> students = new HashMap<>();

        Student s1 = new Student("Сергей", "Петров", 48, 141);
        Student s2 = new Student("Андрей", "Харитян", 20, 142);
        Student s3 = new Student("Иван", "Пашинян", 25, 143);
        Student s4 = new Student("Игорь", "Вартанян", 32, 144);
        Student s5 = new Student("Даша", "Цветканян", 30, 145);
        Student s6 = new Student("Елена", "Незабудканян", 19, 146);
        Student s7 = new Student("Елена", "Бабич", 65, 147);

        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        // students.add(s4);
        // students.add(s5);
        // students.add(s6);
        // students.add(s7);

        students.put(s1.getStudID(), s1);
        students.put(s2.getStudID(), s2);
        students.put(s3.getStudID(), s3);
        students.put(s4.getStudID(), s4);
        students.put(s5.getStudID(), s5);
        students.put(s6.getStudID(), s6);
        students.put(s7.getStudID(), s7);

        FileRepo fileRepo = new FileRepo("StudentDb.txt");
        for (Student student : students.values()) {
            fileRepo.addStudent(student);
        }
        fileRepo.saveAllStudentToFile();

        // iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;
        iGetView view = new ViewEnglish();
        Controller control = new Controller(view, modelFileRepo); //model
        control.run();
        //control.updateView();
    }
}
