public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setA(10);
        System.out.println("Perimeter of square: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setA(10);
        rectangle.setB(20);
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle();
        triangle.setA(10);
        triangle.setB(20);
        triangle.setC(30);
        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rhombus rhombus = new Rhombus();
        rhombus.setA(10);
        System.out.println("Perimeter of rhombus: " + rhombus.getPerimeter());
    }
}