Task_3
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_3 {
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

}


public boolean checkOn(Deque<Integer> deque){

    return false;
}
}
Task_4
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_4 {
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]

}


public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

    return new ArrayDeque<>();
}
}
Task_5
import java.util.Deque;
public class Task_5 {
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {

}

public boolean validate(Deque<Integer> deque){

    return false;
}
}