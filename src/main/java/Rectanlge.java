public class Rectanlge extends Figures {
    public int a;
    public int b;
    public int p;
    public int s;

    public Rectanlge(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void countSquare() {
        s = a * b;
        System.out.println("S for Rectanlge is: " + s);
    }

    @Override
    public void countPerimeter() {
        p = 2 * (a + b);
        System.out.println("P for Rectanlge is: " + p);
    }
}
