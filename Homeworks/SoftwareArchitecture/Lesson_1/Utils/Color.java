package Homeworks.SoftwareArchitecture.Lesson_1.Utils;

public class Color {

    /* Поля для цвета: название цвета и его значение в формате RGB */
    public String colorName;
    public Point3D redGreenBlue;

    /* Конструктор для цвета */
    public Color(String colorName, Point3D redGreenBlue) {
        this.colorName = colorName;
        this.redGreenBlue = redGreenBlue;
    }

    /* Геттеры и сеттеры названия цвета и его значения */
    public String getColorName() {
        return colorName;
    }
    public Point3D getRedGreenBlue() {
        return redGreenBlue;
    }
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    public void setRedGreenBlue(Point3D redGreenBlue) {
        this.redGreenBlue = redGreenBlue;
    }

    
}
