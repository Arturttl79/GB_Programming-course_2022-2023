package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_6;

public class Task_2 {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ухода за ней;
    // б) архивом выставки бульдожков;
    // в) информационной системой Театра бульдожек имени Дарахвелидзе
    public static void main(String[] args) {
        Buldojka sobaka = new Buldojka(5, 30, "Buldog", "Gav", "Anton");
        Buldojka sobaka2 = new Buldojka(5, 30, "Чихуа-хуа", "Gav", "Anton");
        
        sobaka.gladit();
        
        sobaka2.newVystavka("Конкурс красоты");
        sobaka2.newVystavka("Мисс прелесть");
        sobaka2.getVystavka();
       // sobaka2.getAll();
        
    }
}
