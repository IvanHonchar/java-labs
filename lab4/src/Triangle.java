public class Triangle implements Graphic {

    private final Line base;
    private final Line side;

    public Triangle(Line base, Line side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle: base " + base + "; side " + side);
    }
}
