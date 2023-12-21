
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("pink", 3);
        shapes[1] = new Rectangle("red", 4, 5);
        shapes[2] = new Square("blue", 6);

        for (Shape obj : shapes) {
            System.out.println(obj);
        }

        for (Shape obj : shapes) {
            obj.resize(Math.random() * 100);
            System.out.println(obj);
        }

    }
}