public class Circle extends Shape{
    private int radius;
    private final double pi = 3.14;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
