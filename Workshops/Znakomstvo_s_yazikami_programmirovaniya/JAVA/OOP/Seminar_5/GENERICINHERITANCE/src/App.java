import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String,Integer,Long> s1 = new Student<>("Сергей", "Пупкин", 31, (long)5087);
        Student<String,Integer,Long> s2 = new Student<>("Сергей", "Пупкин", 31, (long)5087);
        Student<String,Integer,Long> s3 = new Student<>("Сергей", "Пупкин", 31, (long)5087);
        List<Student<String,Integer,Long>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        
        StudentGroup<String,Integer,Long> group = new StudentGroup<>(listStud);

        for (Student<String,Integer,Long> student : group) {
            System.out.println(student);
        }

        Collections.sort(group.getStudents());
    }
}
