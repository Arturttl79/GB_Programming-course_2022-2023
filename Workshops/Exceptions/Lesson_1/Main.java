package Workshops.Exceptions.Lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArrayLength(new int[]{1, 2, 2, 2, 2,}, 10));
    }
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторый допустимый минимум.
     * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива
     */
    public static int getArrayLength(int[] array, int min){
        if(array.length < min){
            return -1;
        }
        return array.length;
    }


}