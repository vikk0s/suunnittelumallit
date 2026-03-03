package assignments.assignment9.strategy;

import java.util.Random;

public class PerformanceTester {
    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public void testAlgorithm() {
        SortingContext context;

        int size1 = 1000;
        int size2 = 100000;

        long startTime, endTime;

        int[] array1 = generateRandomArray(size1);
        int[] array2 = generateRandomArray(size2);

        context = new SortingContext(new InsertionSortStrategy());
        System.out.println("Insertion sort on " + size1 + " elements:");
        startTime = System.nanoTime();
        context.getStrategy().sort(array1.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");

        context = new SortingContext(new InsertionSortStrategy());
        System.out.println("Insertion sort on " + size2 + " elements:");
        startTime = System.nanoTime();
        context.getStrategy().sort(array2.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");

        context = new SortingContext(new MergeSortStrategy());
        System.out.println("Merge sort on " + size1 + " elements:");
        startTime = System.nanoTime();
        context.getStrategy().sort(array1.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");

        context = new SortingContext(new MergeSortStrategy());
        System.out.println("Merge sort on " + size2 + "elements");
        startTime = System.nanoTime();
        context.getStrategy().sort(array2.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");

        context = new SortingContext(new SelectionSortStrategy());
        System.out.println("Selection sort on " + size1 + "elements");
        startTime = System.nanoTime();
        context.getStrategy().sort(array1.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");

        context = new SortingContext(new SelectionSortStrategy());
        System.out.println("Selection sort on " + size2 + "elements");
        startTime = System.nanoTime();
        context.getStrategy().sort(array2.clone());
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " microseconds");
    }
}
