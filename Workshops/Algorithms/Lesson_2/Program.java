package Workshops.Algorithms.Lesson_2;

public class Program {

    public static void main(String[] args) {

        // creation of array with random numbers
        System.out.println("\nSorting with Direct Sorting Method:");
        int[] array = ArrayUtils.prepareArray();
        //ArrayUtils.printArray(array);
        System.out.println();

        // sorting of array with direct Sorting method
        long startDirect = System.currentTimeMillis();
        SortUtils.directSort(array);
        //ArrayUtils.printArray(array);
        long endDirect = System.currentTimeMillis();
        long resultDirect = endDirect - startDirect;
        System.out.println("\nTime required for the sorting = " + resultDirect + "milliseconds");

        // creation of another array with random numbers
        System.out.println("\n\nSorting with Quick Sorting Method:");
        array = ArrayUtils.prepareArray();
        //ArrayUtils.printArray(array);
        System.out.println();

        // sorting of array with quick Sorting method
        long startQuick = System.currentTimeMillis();
        SortUtils.quickSort(array);
        //ArrayUtils.printArray(array);
        long endQuick = System.currentTimeMillis();
        long resultQuick = endQuick - startQuick;
        System.out.println("\nTime required for the sorting = " + resultQuick + "milliseconds");

        // creation of another array with random numbers
        System.out.println("\n\nSorting with Pyramid Sorting Method:");
        array = ArrayUtils.prepareArray();
        //ArrayUtils.printArray(array);
        System.out.println();

        // sorting of array with pyramid Sorting method
        long startPyramid = System.currentTimeMillis();
        SortUtils.heapSort(array);
        //ArrayUtils.printArray(array);
        long endPyramid = System.currentTimeMillis();
        long resultPyramid = endPyramid - startPyramid;
        System.out.println("\nTime required for the sorting = " + resultPyramid + "milliseconds");

        // using of Binary search method for sorted array
        System.out.println("\n\nSearching by using Binary search method for sorted array:");
        int value = array[2];
        System.out.println(value);
        int res = SearchUtils.binarySearch(array, value);
        System.out.println("Index of the element that we are looking for = " + res);
    }

}
