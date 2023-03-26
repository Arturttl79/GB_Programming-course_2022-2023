// Task_3. 
// Реализовать простой калькулятор (+,-,/,*), только с целыми числами.

package Homeworks.JAVA.Seminar_1;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Vvedite pervoe chislo: ");
            int x = scanner.nextInt();
            System.out.printf("Vvedite arifmeticheskuyu operaciyu (1: '+', 2: '-', 3: '/', 4: '*'): ");
            int operation = scanner.nextInt();
            System.out.printf("Vvedite vtoroe chislo: ");
            int y = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println(x + y);
                    break;
                case 2:
                    System.out.println(x - y);
                    break;
                case 3:
                    System.out.println(x / y);
                    break;
                case 4:
                    System.out.println(x * y); 
                    break;        
                default:
                    System.out.println("Vy vveli nevernye danniye. Vvedite korrektnye dannye.");
                    break;
            }
            System.out.printf("Vybirete dal`neyshee deystvie(0: 'Zakonchit`, 1: 'Prodolzhit'): ");
            int repeat = scanner.nextInt();
            if (repeat == 0) {
                scanner.close();
                break;
            }
        }    
    }
}
