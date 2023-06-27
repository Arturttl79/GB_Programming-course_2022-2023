package calculator;

import java.util.Scanner;

public class ViewCalculator {
    
    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public static Scanner in = new Scanner(System.in);

    public void run() {
        while (true) {
            int primaryArg = promptInt("Vvedite perviy argument: ");
            iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Vvedite komandu (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Vvedite vtoroy argument: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Vvedite vtoroy argument: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Resultat %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

