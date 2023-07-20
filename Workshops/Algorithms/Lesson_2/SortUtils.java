package Workshops.Algorithms.Lesson_2;

public class SortUtils {
    /* Сортировка выборкой */

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int saveIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[saveIndex]) {
                    saveIndex = j;
                }
            }

            if (saveIndex != i) {
                int buf = array[i];
                array[i] = array[saveIndex];
                array[saveIndex] = buf;
            }
        }
    }

    public static void quickSort(int[] array) {
        if (array == null)
            return;
        else 
            quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int middle = array[(start + end) / 2];

        do {
            while (array[left] < middle) {
                left++;
            }

            while (array[right] > middle) {
                right--;
            }

            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < end) {
            quickSort(array, left, end);
        }

        if (start < right) {
            quickSort(array, start, right);
        }
    }

    public static void heapSort(int[] array) {
        // building of heap (regrouping of the array)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            pyramidSort(array, i, array.length);
        }

        // extracting of elements one by one from heap
        for (int i = array.length - 1; i >= 0; i--) {
            // moving current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // calling pyramid Sort on reduced heap
            pyramidSort(array, 0, i);
        }
    }

    private static void pyramidSort(int[] array, int rootIndex, int heapSize) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // If left child is bigger than parrent
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // If right child is bigger than parrent
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // If largest element is not parrent
        if (largest != rootIndex) {
            int temp = array[largest];
            array[largest] = array[rootIndex];
            array[rootIndex] = temp;
            
            // recursively transforming touched branch to binary heap
            pyramidSort(array, largest, heapSize);
        }
    }
}