package assignments.assignment20.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence(10);

        Iterator<Integer> iterator = fibonacciSequence.iterator();

        System.out.println("Fibonacci sequence:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
