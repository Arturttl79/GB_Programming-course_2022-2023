package Workshops.Algorithms.Lesson_2;

public class SearchUtils {

    public static int binarySearch(int[] array, int value) {
        if (array == null) {
            return -1;
        } else 
            return binarySearch(array, value, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int value, int start, int end) {
        if (end < start) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, start, middle - 1);
        } else
            return binarySearch(array, value, middle + 1, end);
    }
}
