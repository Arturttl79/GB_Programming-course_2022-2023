package Workshops.Exceptions.Lesson_2;

import java.util.Arrays;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task_2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                { "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "2" },
                { "3", "3" },
                { "2", "6" }
        };

        String[][] arr0 = new String[][] {
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "1", "1", "1", "1" }
        };
        System.out.println(sum2d(arr));
    //     String[][] arrNew = fillArray(arr);
    //     for (int i = 0; i < arrNew.length; i++) {
    //         System.out.println(Arrays.toString(arrNew[i]));
    //     }
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Не число");
        } catch (ArrayIndexOutOfBoundsException e) {
            sum2d(fillArray(arr, 5));
        }
        return sum;
    }

    private static String[][] fillArray(String[][] arr, int length) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < arr.length) {
                String[] temp = new String[arr.length];
                System.arraycopy(arr[i], 0, temp, 0, arr[i].length);
                for (int j = arr[i].length; j < arr.length; j++) {
                    temp[j] = "0";
                }
                arr[i] = temp;
            }
        }
        return arr;
    }
}