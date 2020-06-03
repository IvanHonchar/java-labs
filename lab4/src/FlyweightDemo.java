public class FlyweightDemo {

    public static void main(String[] args) {
        new Rectangle(Line.create(0, 0, 0, 5), Line.create(0, 5, 5, 5)).draw();
        new Triangle(Line.create(0, 0, 0, 5), Line.create(0, 0, 0, 3)).draw();
        Line.create(0, 0, 0, 5).draw();
        System.out.println(Line.getTotalLinesCreated());
    }
}
