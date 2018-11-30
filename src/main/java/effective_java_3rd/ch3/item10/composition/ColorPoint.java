package effective_java_3rd.ch3.item10.composition;

import effective_java_3rd.ch3.item10.Color;
import effective_java_3rd.ch3.item10.Point;

import java.util.Objects;

// Adds a value component without violating the equals contract (page 44)
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public int hashCode() {
        return 31 * point.hashCode() + color.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
