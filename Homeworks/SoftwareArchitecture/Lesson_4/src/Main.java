package Homeworks.SoftwareArchitecture.Lesson_4.src;

public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        figureBox.add(circle1);

        figureBox.getInfo(0);

    }
}