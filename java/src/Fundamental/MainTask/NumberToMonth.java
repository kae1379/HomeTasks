package Fundamental.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

/**
 * 5.   Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
public class NumberToMonth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text1 = "введите число от 1 до 12:";
        String text0 = "введённое число не соответствует условию, ";
        System.out.println(text1);
        int number = Integer.parseInt(reader.readLine());
        while (number < 1 || number > 12) {
            System.out.println(text0 + text1);
            number = Integer.parseInt(reader.readLine());
        }
        System.out.println(Month.of(number));
    }
}
