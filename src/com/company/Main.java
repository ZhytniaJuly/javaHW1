package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float i;
        float j;
        System.out.print("Введите первое число: ");
        i = sc.nextFloat();
        System.out.print("Введите второе число: ");
        j = sc.nextFloat();
        System.out.println("Ближайшее число к 10 - "+ check (i,j));;
    }

    private static float check(float i, float j) {
        float result;
        if (Math.abs(10 - i) < Math.abs(10-j)) {
            result = i;
        } else {
            result = j;
        }
        return result;
    }
}

