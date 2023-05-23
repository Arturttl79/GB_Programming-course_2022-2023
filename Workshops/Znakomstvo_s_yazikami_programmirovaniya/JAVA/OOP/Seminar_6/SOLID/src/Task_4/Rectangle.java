package Task_4;

public class Rectangle extends Square {
    private int height;

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return super.getWidth() * this.height;
    }
}
