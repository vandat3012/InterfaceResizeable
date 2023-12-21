public class Circle extends Shape{
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent/200);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Area Circle = " + getArea() +
                '}';
    }
}
