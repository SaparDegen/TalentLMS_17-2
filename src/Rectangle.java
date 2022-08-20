public class Rectangle extends Shape {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }
}
