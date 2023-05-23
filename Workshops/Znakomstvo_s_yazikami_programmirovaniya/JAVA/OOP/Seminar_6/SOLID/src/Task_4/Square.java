package Task_4;

public class Square {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    
    public double area() {
        return Math.pow(this.width, 2);
    }
}