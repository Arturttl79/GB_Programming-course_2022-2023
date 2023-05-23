import Task_4.Rectangle;
import Task_4.Square;

public class App {
    public static void main(String[] args) throws Exception {

        Square sq = new Square();
        sq.setWidth(10);
        System.out.println(sq.area());

        Rectangle rc = new Rectangle();
        rc.setWidth(10);
        rc.setHeight(5);
        System.out.println(rc.area());
    }
}
