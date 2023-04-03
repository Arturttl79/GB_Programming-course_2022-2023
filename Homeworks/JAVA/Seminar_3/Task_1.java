// Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне, 
// и постораться написать их на java)

package Homeworks.JAVA.Seminar_3;

import java.util.*;

public class Task_1 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
        
    public static int[] sortByMerge(int[] list) {
        if (list == null) return null;
        if (list.length < 2) return list;
        int[] listA = new int[list.length / 2];
        int[] listB = new int[list.length - list.length / 2];
        //int[] listC = new int[list.length];
        System.arraycopy(list, 0, listA, 0, list.length / 2);
        System.arraycopy(list, list.length / 2, listB, 0, list.length - list.length / 2);
        listA = sortByMerge(listA);
        listB = sortByMerge(listB);
        int[] listC = mergeLists(listA, listB);
        return listC;
    }

    public static int[] mergeLists(int[] listA, int[] listB) {
        int[] listC = new int[listA.length + listB.length];
        int posA = 0;
        int posB = 0;
        for (int i = 0; i < listA.length + listB.length; i++) {
            if (posA == listA.length) {
                listC[i] = listB[i - posA];
                posB++;
            } else if (posB == listB.length) {
                listC[i] = listA[i - posB];
                posA++;
            } else if (listA[i - posB] < listB[i - posA]) {
                listC[i] = listA[i - posB];
                posA++;
            } else {
                listC[i] = listB[i - posA];
                posB++;
            }
        }
        return listC;
    }

    public static void replaceTwoItems(int[] list, int indexOfFirstItem, int indexOfSecondItem) {
        int temp = list[indexOfSecondItem];
        list[indexOfSecondItem] = list[indexOfFirstItem];
        list[indexOfFirstItem] = temp;
    }
    
    public static void sortByComparing(int[] list) {
        int count = list.length;
        int maxValueIndex = 0;
        for (int i = 0; i < count; i++) {
            if (list[i] > list[maxValueIndex]) {
            maxValueIndex = i;
            }
            if (i == count - 1) {
                replaceTwoItems(list, maxValueIndex, count - 1);
                maxValueIndex = 0;
                i = 0;
                count--;
            }

        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();           // Размер массива
        long s = System.currentTimeMillis(); // Переменная для расчета времени вычисления
        int[] list = random.ints(n, 0, 1000000).toArray();  // заполнение рандомными числами
        int[] sortedList = sortByMerge(list); // Сортировка слиянием
        printArray(sortedList);               // Распечатка сортировки слиянием 

        sortByComparing(list); // Сортировка выборкой
        printArray(list);      // Распечатка сортировки выборкой

        System.out.println(System.currentTimeMillis() - s); // Для просмотра быстроты вычисления двух методов
    }
}
