package Workshops.Algorithms;

public class Lesson_1 {
    public static void main(String[] args) {
        
        /*
         * Algorithm of counting of sum of numbers.
         */

         int lastNumber = 17;
         System.out.printf("Sum of all number from 1 to %d = %d", lastNumber, sum(lastNumber));
    }

    public static int sum(int lastNumber){
        int sum = 0;
        for (int i = 1; i < lastNumber; i++) {
            sum += i;
        }
        return sum;
        } 
}