package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(8.3, 7.1, 2.5);
        c1.print();
        c1.setX(3.9);
        c1.setY(1.0);
        c1.setRadius(6);
        System.out.print(c1.getLenght());
    }
}