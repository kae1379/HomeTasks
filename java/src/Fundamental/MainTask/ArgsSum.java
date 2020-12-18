package Fundamental.MainTask;

/**
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class ArgsSum {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Сума аргументов командной строки = " + sum);
    }
}
