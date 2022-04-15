public class Bridge {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3, new RedDraw());
        circle.draw();
        Circle circle2 = new Circle(4, 5, 6, new GreenDraw());
        circle2.draw();
    }
}
