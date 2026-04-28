package assignments.assignment20.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int count;
    private int limit;
    private int previous;
    private int current;

    public FibonacciIterator(int limit) {
        this.count = 0;
        this.limit = limit;
        this.previous = 1;
        this.current = 1;
    }

    public boolean hasNext() {
        return count < limit;
    }

    public Integer next() {
        if (count == 0 || count == 1) {
            count++;
            return 1;
        }

        int next = previous + current;
        previous = current;
        current = next;
        count++;
        return next;
    }
}
