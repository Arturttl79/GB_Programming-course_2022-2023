package Homeworks.JAVA.Seminar_4;
import java.util.*;
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
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] bracketsArray = scanner.next().split("");
        Deque<String> bracketsList = new ArrayDeque<>(Arrays.asList(bracketsArray));
        System.out.println(validate(bracketsList) ? "true" : "false");
    }

    public static boolean validate(Deque<String> deque){
        boolean flag = false;
        int size = deque.size() / 2;
        if (deque.getFirst().equals("(") || deque.getFirst().equals("{") || deque.getFirst().equals("[")) {
            for (int i = 0; i < size; i++) {
                // boolean roundBracket, squareBracket, curlyBracket;
                if (deque.getFirst().equals("(") & deque.getLast().equals(")")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals(")")) {
                        deque.removeFirst();
                    } else deque.removeLast();
                } else if (deque.getFirst().equals("{") & deque.getLast().equals("}")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals("}")) {
                        deque.removeFirst();
                    } else deque.removeLast();
                } else if (deque.getFirst().equals("[") & deque.getLast().equals("]")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals("]")) {
                        deque.removeFirst();
                    } else deque.removeLast();
                } else if (deque.getFirst().equals("(")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals(")")) {
                        deque.removeFirst();
                    }
                } else if (deque.getFirst().equals("{")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals("}")) {
                        deque.removeFirst();
                    }
                } else if (deque.getFirst().equals("[")) {
                    deque.removeFirst();
                    if (deque.getFirst().equals("]")) {
                        deque.removeFirst();
                    }
                }
            }
            if (deque.size() == 0) flag = true;
        }
        return flag;
    }
}
