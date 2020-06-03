import java.util.HashMap;
import java.util.Map;

public class Line implements Graphic {

    private final int x1; // x coordinate of first point
    private final int y1; // y coordinate of first point
    private final int x2; // x coordinate of second point
    private final int y2; // y coordinate of second point

    private Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private static final Map<String, Line> cache = new HashMap<>();

    public static Line create(int x1, int y1, int x2, int y2) {
        Line line = new Line(x1, y1, x2, y2);
        return cache.computeIfAbsent(line.toString(), x -> line);
    }

    @Override
    public void draw() {
        System.out.println("Drawing line: " + toString());
    }

    @Override
    public String toString() {
        return "(" + x1 + ","  + y1 + ")-(" + x2 + "," + y2 + ")";
    }

    public static int getTotalLinesCreated() {
        return cache.size();
    }
}
