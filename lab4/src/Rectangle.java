public class Rectangle implements Graphic {

    private final Line height;
    private final Line width;

    public Rectangle(Line height, Line width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle: height " + height + "; width " + width);
    }
}
