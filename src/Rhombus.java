public class Rhombus extends Shape{
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
