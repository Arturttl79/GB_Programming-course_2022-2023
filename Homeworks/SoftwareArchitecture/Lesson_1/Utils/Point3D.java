package Homeworks.SoftwareArchitecture.Lesson_1.Utils;

public class Point3D {

    /* Координаты точки в трехмерном пространстве */
    public int x;
    public int y;
    public int z;

    /* Конструктор для трехмерной точки */
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /* Геттеры и сеттеры для координат точки */
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }

    
    
}
