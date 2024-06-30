package hw7.view;

import java.util.Scanner;

import hw7.connector.ComplexConnector;
import hw7.connector.LogCalcConnector;
import hw7.model.Complex;
import hw7.service.FileLogger;

public class CalcComplexView {
    private Scanner sc = new Scanner(System.in);
    
    private ComplexConnector complexConnector = new ComplexConnector();
    private LogCalcConnector calculator;

    public void start() {
        while (true) {
            prepare();
            String action = prompt("====================\nПродолжить вычисления? (y/n) ");
            if (action.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

    private void prepare() {
        Complex firstComplex = promptComplex("\nВведите первое число: ");
        calculator = new LogCalcConnector(firstComplex, new FileLogger());
        boolean flag = true;
        while (flag) {
            String operator = prompt("Чтобы выполнить действие введите оператор (*, +, /, -); для вывода результата - (=): ");
            
            if (operator.equals("*")) {
                calculator.multiply(promptComplex("\nВведите следующее число: "));
            }

            if (operator.equals("+")) {
                calculator.sum(promptComplex("\nВведите следующее число: "));
            }

            if (operator.equals("/")) {
                calculator.divide(promptComplex("\nВведите следующее число: "));
            }

            if (operator.equals("-")) {
                calculator.subtraction(promptComplex("\nВведите следующее число: "));
            }

            if (operator.equals("=")) {
                System.out.printf("====================\nРезультат вычислений: %s\n", calculator.getResult());
                flag = false;
            }
        }
    }

    private String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    private double promptDouble(String message) {
        System.out.print(message);
        return Double.parseDouble(sc.nextLine());
    }

    private Complex promptComplex(String message) {
        System.out.println(message);
        double re = promptDouble("Введите действительную часть: ");
        double im = promptDouble("Введите мнимую часть: ");
        return complexConnector.createComplex(re, im);
    }

}
