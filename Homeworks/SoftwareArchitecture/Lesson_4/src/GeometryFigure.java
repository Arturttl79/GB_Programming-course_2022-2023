import java.util.List;

public class GeometryFigure {
    static private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new List<IShape>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }
    // Метод для удаления фигуры

    // Метод поиска необходимой фигуры

    // Метод отображения подробной информации о фигурк
    public void getInfo(int num) {
        if (...) {
            ...
        }
        IShape figure = toolbox[num];
        System.out.ptintln(figure.getArea(), figure.getPerimeter());
    }

    // ...
}
