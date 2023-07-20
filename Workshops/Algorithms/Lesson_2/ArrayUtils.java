package Workshops.Algorithms.Lesson_2;

import java.util.Random;

public class ArrayUtils {

    private static Random random = new Random();

    public static int[] prepareArray() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-999, 1000);
        }
        return arr;
    }

    public static void printArray(int[] array){
        for (int element : array) {
            System.out.printf("%d\t", element);
        }
    }
}
