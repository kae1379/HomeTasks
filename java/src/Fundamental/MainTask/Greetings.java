package Fundamental.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Greetings {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите своё имя");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Приветствую Вас, " + name + "!");
    }
}
