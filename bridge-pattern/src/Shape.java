public abstract class Shape {
    protected Draw draw;

    public Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract void draw();
}
