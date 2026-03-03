package assignments.assignment9.strategy;

import java.util.Arrays;

import static assignments.assignment9.strategy.InsertionSort.*;

public class InsertionSortStrategy implements SortingStrategy {
    public void sort(int[] array) {
        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
    }
}
