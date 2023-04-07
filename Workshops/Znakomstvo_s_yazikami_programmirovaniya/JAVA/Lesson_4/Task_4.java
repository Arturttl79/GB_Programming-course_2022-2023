package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_4;
import java.util.*;
public class Task_4 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        LinkedList<Integer> ll = new LinkedList<Integer>();
        String str = new String(); 
        String str1 = new String(); 
        int d1Size = d1.size();
        int d2Size = d2.size();      
        for (int index = 0; index < d1Size; index++) {
            str += d1.pollLast();
            //ll.add(d1.peekLast() + d2.peekLast());    
        }
        for (int i = 0; i < d2Size; i++) {
            str1 += d2.pollLast();
        }
        //System.out.println(str);
        //System.out.println(str1);
        int summ =  Integer.parseInt(str) + Integer.parseInt(str1);

        while (summ > 0 ) {
            ll.add(summ%10);
            summ = summ/10;
            
        }
        System.out.println(ll);
    }
}

// public static List<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
//     List<Integer> result = new ArrayList<>();
//     int temp = 0;
//     int n = d1.size();
//     for (int i = 0; i < n; i++){
//         int n1 = d1.removeFirst();
//         int n2 = d2.removeFirst();
//         int sum = n1 + n2;
//         if (sum >= 10){
//             result.add(sum%10 + temp++);
//         }else{
//             result.add(sum + temp);
//             temp = 0;
//         }
//     }
//     result.add(temp);
//     return result;
// }