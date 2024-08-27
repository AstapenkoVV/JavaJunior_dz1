package ru.gb.dz.lesson1;

import java.util.Arrays;
import java.util.List;

/*
Напишите программу, которая использует Stream API для обработки списка чисел. Программа должна вывести
на экран среднее значение всех четных чисел в списке.
 */

public class Program {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1, 2, 32, 22, 43, 456, 5, 356, 64, 33, 9);
        listNumbers.stream().filter(n -> n % 2 == 0).mapToInt(e -> e).average()
                .stream().forEach(System.out::println);
    }
}
