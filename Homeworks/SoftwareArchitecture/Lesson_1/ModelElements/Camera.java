package Homeworks.SoftwareArchitecture.Lesson_1.ModelElements;

import java.util.Random;

import Homeworks.SoftwareArchitecture.Lesson_1.Utils.Angle3D;
import Homeworks.SoftwareArchitecture.Lesson_1.Utils.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;
    private Random random;
    
    void rotate(Angle3D newAngle) { 
        newAngle.setAngleOnXYPlane(random.nextInt(360 - newAngle.getAngleOnXYPlane()));
        newAngle.setAngleOnXZPlane(random.nextInt(360 - newAngle.getAngleOnXZPlane()));
        newAngle.setAngleOnYZPlane(random.nextInt(360 - newAngle.getAngleOnYZPlane()));
    }

    void move(Point3D newPoint) {
        newPoint.setX(newPoint.getX() + random.nextInt(100));
        newPoint.setY(newPoint.getY() + random.nextInt(100));
        newPoint.setZ(newPoint.getZ() + random.nextInt(100));
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Angle3D getAngle() {
        return angle;
    }

    
}
