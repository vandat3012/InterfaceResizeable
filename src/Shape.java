public abstract class Shape implements InterfaceResizeable{
    private String color = "red";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "Area ='" + color + '\'' +
                '}';
    }
}
