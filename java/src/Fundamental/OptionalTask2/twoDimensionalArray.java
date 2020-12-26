package Fundamental.OptionalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * В заднии достаточно выполнить 1-2 пункта
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M с
 * помощью генератора случайных чисел (класс Random).
 * 1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 * 2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 * 3.     Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 * 4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */

public class twoDimensionalArray {

    public static void printArray(int [][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {

        System.out.println("Введите размерность матрицы a [n] [n]:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int [][] arr = new int[n][n];
        int M = 33;
        int column = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random()*M*2+1-M);
            }
        }
        System.out.println("1. Массив создан: \n");
        printArray(arr, n);

//         1. Упорядочить строки матрицы в порядке возрастания значений элементов k-го столбца (здесь column).
//         кз как это работает, да ещё и лямда-выражения...
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] entry1, int[] entry2) {
//            if (entry1[column] > entry2[column])
        Arrays.sort(arr, (entry1, entry2) -> {
            if (entry1[column] > entry2[column])
                return 1;
            else
                return -1;
        });
        System.out.println(" \n2. упорядочены строки в порядке возрастания значений элементов " + column + "-го столбца\n");
        printArray(arr, n);

        //2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        int countIncreaseSuccession = 1;
        int countISFinal = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j-1] < arr[i][j]) {
                    countIncreaseSuccession++;
                }
                else {
                    countISFinal = Math.max(countIncreaseSuccession, countISFinal);
                    countIncreaseSuccession = 1;
                }
            }
        }
        System.out.println(" \n3. наибольшее число возрастающих элементов матрицы, идущих подряд = " + countISFinal);
    }
}
