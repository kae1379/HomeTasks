package Fundamental.OptionalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 *
 *          иначе задачу можно решить с использованием строк
 *          public int getCountsOfDigits(long number) {
 *         return String.valueOf(Math.abs(number)).length();
 *     }
 */

public class ShortestAndLongestNumbers {

    public static int countDigits (int number) {
        int count = (number == 0) ? 1 : 0;
        while (number!=0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Напишите, сколько цифр будет сравниваться:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maxDigits = 0;
        int numberOfMaxDigits = 0;
        int minDigits = 0;
        int numberOfMinDigits = 0;
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            if(i == 0) {
                maxDigits = minDigits = countDigits(number);
                numberOfMinDigits = numberOfMaxDigits = number;
            }
            else {
                if(maxDigits < countDigits(number)) {
                    maxDigits = countDigits(number);
                    numberOfMaxDigits = number;
                }
                if(minDigits > countDigits(number)) {
                    minDigits = countDigits(number);
                    numberOfMinDigits = number;
                }
            }
        }
        System.out.println("Самое длинное число = " + numberOfMaxDigits + ", его длина = " +  maxDigits);
        System.out.println("Самое короткое число = " + numberOfMinDigits + ", его длина = " +  minDigits);
    }
}
