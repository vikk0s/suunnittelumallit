package assignments.assignment9.strategy;

import static assignments.assignment9.strategy.MergeSort.mergeSort;

public class MergeSortStrategy implements SortingStrategy {
    public void sort(int[] array) {
        MergeSort sorter = new MergeSort();

        int l = 0;
        int r = array.length - 1;
        int m = l + (r - l) / 2;
        sorter.mergeSort(array, l, r);
    }
}
