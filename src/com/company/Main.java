package com.company;

public class Main {
    public static void main(String[] args) {

        int[] array;
        array = new int[4];
//      int[] array = {1, 10, 25, 99};
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*90+10);
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*90+10);
            System.out.print(array[i]+" ");
        }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    if (array[i - 1] >= array[i]) {
                        System.out.println("Последовательность не возрастающая");
                        break;
                    }
                }
                    if (i == array.length - 1)
                        System.out.println("Последовательность возрастающая");

            }

        }
    }


