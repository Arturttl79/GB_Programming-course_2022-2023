package Workshops.Exceptions.Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Integer[] newarray = new Integer[]{1,2,5,3,6,8};
        checkArray(newarray);
    }
    /**
     * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
     * Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
     * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
     * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */
    private static void checkArray(Integer[] arr){
        List<Integer> indexes = new ArrayList<>(1);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                indexes.add(i);
            }
        }
        if(!indexes.isEmpty()){
            throw new RuntimeException(String.format("В массиве встретился null в ячейках с индексами: %s", indexes));
        }
        System.out.println("В массиве null не встретились");
    }
}