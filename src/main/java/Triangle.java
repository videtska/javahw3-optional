public class Triangle extends Figures{

    public double a,b,c;
    public double p;
    public double s;
    public double p2;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void countPerimeter() {
        p = a + b + c;
        System.out.println("P for Triangle is: " + p);
    }

    @Override
    public void countSquare() {
        p2 = (a + b + c) / 2;
        s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
        System.out.println("S for Triangle is: " + s);
    }
}
