package Homeworks.SoftwareArchitecture.Lesson_1.ModelElements;

import java.util.Scanner;

public class Scene {
    
    public int id;
    public PoligonalModel models;
    public Flash flashes;
    public Camera camera;


    public Scene(int id, PoligonalModel models, Flash flashes, Camera camera) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public Scene(PoligonalModel models, Flash flashes, Camera camera) {
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public Flash flashWithNewColor(Flash oldFlash) {
        Flash newFlash = oldFlash;
        System.out.println("Type new color name for flash");
        newFlash.getColor().setColorName(scanner.nextLine());
        return newFlash;
    }

    public Camera cameraWithNewParameters(Camera firstCamera, Camera secondCamera) {
        Camera newCamera = new Camera();
        newCamera.setAngle(firstCamera.getAngle());
        newCamera.setLocation(secondCamera.getLocation());
        return newCamera;
    }

    public Scanner scanner = new Scanner(System.in);
}
