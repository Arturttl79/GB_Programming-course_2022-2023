package Workshops.Exceptions.Lesson_1;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][] {
                {1, 0, 1},
                {1, 0, 1},
                {2, 0, 1},
        };
        System.out.println(sumElementsOfArray(ints));
    }
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
     * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
     * и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
     * метод должен бросить RuntimeException с сообщением об ошибке.
     */
    private static int sumElementsOfArray(int[][] array){
        int counter = 0;
        if(isNotSquareArray(array)){
            throw new RuntimeException("Массив не квадратный");
        }
        if(isDataIncorrect(array)){
            throw new RuntimeException("Массив должен содержать 0 либо 1");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter += array[i][j];
            }
        }
        return counter;
    }
    private static boolean isNotSquareArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != array.length){
                return true;
            }
        }
        return false;
    }
    private static boolean isDataIncorrect(int[][] array){
        List<Integer> conteiner = List.of(0, 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(!conteiner.contains(array[i][j])){
                    return true;
                }
            }
        }
        return false;
    }
}