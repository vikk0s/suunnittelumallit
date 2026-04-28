package assignments.assignment20.iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    private int limit;

    public FibonacciSequence(int limit) {
        this.limit = limit;
    }

    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }
}
