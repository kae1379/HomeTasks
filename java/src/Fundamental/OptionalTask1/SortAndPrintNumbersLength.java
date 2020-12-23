package Fundamental.OptionalTask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
2.     Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class SortAndPrintNumbersLength {

    public static int countDigits (int number) {
        int count = (number == 0) ? 1 : 0;
        while (number!=0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(countDigits(array[j]) < countDigits(array[i])) {
                    int temp = array[i];
                    array [i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
