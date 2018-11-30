package effective_java_3rd.ch3.item10.inheritance;

import effective_java_3rd.ch3.item10.Point;

import java.util.concurrent.atomic.AtomicInteger;

// Trivial subclass of Point - doesn't add a value component (Page 43)
public class CounterPoint extends Point {
    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}
