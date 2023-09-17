public class Rectangle implements IShape{
    private double side1;
    private double side2;
    private String name;

    public Rectangle(double side1, double side2, String name) {
        this.side1 = side1;
        this.side2 = side2;
        this.name = name;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
