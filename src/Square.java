public class Square extends Shape {
    private double edge = 1;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public void resize(double percent) {
        this.edge *= (percent /200);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Area Square =" + getArea() +
                '}';
    }
}
