package Homeworks.SoftwareArchitecture.Lesson_1.Utils;

public class Angle3D {

    /* Аттрибуты угла в трехмерном пространстве: углы в градусах в трех измерениях*/
    public int angleOnXYPlane;
    public int angleOnXZPlane;
    public int angleOnYZPlane;

    /* Конструктор для угла в трехмерном пространстве */
    public Angle3D(int angleOnXYPlane, int angleOnXZPlane, int angleOnYZPlane) {
        this.angleOnXYPlane = angleOnXYPlane;
        this.angleOnXZPlane = angleOnXZPlane;
        this.angleOnYZPlane = angleOnYZPlane;
    }
    
    /* Геттеры и сеттеры для угла */
    public int getAngleOnXYPlane() {
        return angleOnXYPlane;
    }
    public int getAngleOnXZPlane() {
        return angleOnXZPlane;
    }
    public int getAngleOnYZPlane() {
        return angleOnYZPlane;
    }
    public void setAngleOnXYPlane(int angleOnXYPlane) {
        this.angleOnXYPlane = angleOnXYPlane;
    }
    public void setAngleOnXZPlane(int angleOnXZPlane) {
        this.angleOnXZPlane = angleOnXZPlane;
    }
    public void setAngleOnYZPlane(int angleOnYZPlane) {
        this.angleOnYZPlane = angleOnYZPlane;
    }

    
    
}
