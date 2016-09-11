package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число: ");
        i = sc.nextInt();
        System.out.println("Вы ввели "+ checkValue(i));
    }

    private static String checkValue(int i) {
        String result;
        if ((i % 2) == 0) {
            result = "число " + i + " - оно четное ";
        } else {
                result = "число " + i + " - оно нечетное ";
            }
        return result;
    }
}

