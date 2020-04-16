public class Circle extends Figures {
    public double r;
    public double s;
    public double p;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void countSquare() {
        s = Math.PI * Math.pow(r,2);
        System.out.println("S for Circle is: " + s);
    }

    @Override
    public void countPerimeter() {
        p = 2 * r * Math.PI;
        System.out.println("P for Circle is: " + p);
    }
}
