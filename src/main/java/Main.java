public class Main {
    public static void main(String[] args) {
        Figures figure_tr = new Triangle(2,3,2);
        figure_tr.countPerimeter();
        figure_tr.countSquare();

        Figures figure_circle = new Circle(2);
        figure_circle.countSquare();
        figure_circle.countPerimeter();

        Figures figure_rectangle = new Rectanlge(2,4);
        figure_rectangle.countPerimeter();
        figure_rectangle.countSquare();
    }
}
