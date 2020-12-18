package Fundamental.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */

public class RandomNumbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int [] randomNumArray = new int[n];
        for(int i = 0; i < randomNumArray.length; i++) {
            randomNumArray[i] = (int) ((Math.random() * 1111) + 1);
            int el = randomNumArray[i];
            if (el%2 == 0) {
                System.out.print(el + " ");
            }
            else {
                System.out.println(el);
            }
        }
    }
}
