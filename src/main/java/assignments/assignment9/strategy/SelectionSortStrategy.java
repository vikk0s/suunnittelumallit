package assignments.assignment9.strategy;

import static assignments.assignment9.strategy.SelectionSort.*;

public class SelectionSortStrategy implements SortingStrategy {
    public void sort(int[] array) {
        SelectionSort sorter = new SelectionSort();

        sorter.selectionSort(array);
    }
}
