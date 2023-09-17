public class App {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10, "Окружность_1");
        Circle circle2 = new Circle(5, "Окружность_2");
        Triangle triangle1 = new Triangle(5, 6, 7, "Треугольник_1");
        Triangle triangle2 = new Triangle(3, 3, 3, "Треугольник_2");
        Rectangle rectangle1 = new Rectangle(5, 10, "Прямоугольник_1");
        Rectangle rectangle2 = new Rectangle(2, 2, "Квадрат");
        
        figureBox.add(circle1);
        figureBox.add(circle2);
        figureBox.add(triangle1);
        figureBox.add(triangle2);
        figureBox.add(rectangle1);
        figureBox.add(rectangle2);

        figureBox.getInfo(0);
        figureBox.getInfo(1);
        figureBox.getInfo(2);
        figureBox.getInfo(3);
        figureBox.getInfo(4);
        figureBox.getInfo(5);
        figureBox.getInfo(6);

        figureBox.search(circle2);
        figureBox.search(rectangle1);

        figureBox.remove(6);
        figureBox.remove(5);

        figureBox.search(rectangle2);

    }
}
