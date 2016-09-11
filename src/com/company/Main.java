package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        float averageSum1;
        float averageSum2;
        array1 = new int[5];
        array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random()*6) );
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            array2[i] = ((int)(Math.random()*6) );
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        averageSum1 =  calculateAverageSum (array1);
        averageSum2 =  calculateAverageSum (array2);
        if (averageSum1 == averageSum2){
            System.out.println("Среднее арифметическое у первого и второго массива равны " + averageSum2);
        } else if (averageSum1 > averageSum2){
            System.out.println("Среднее арифметическо у первого массива больше: "+"averageSum1="+averageSum1+ " averageSum2="+averageSum2);
        } else System.out.println("Среднее арифметическо у второго массива больше "+"averageSum1="+averageSum1+ " averageSum2="+averageSum2);
    }

    private static float calculateAverageSum(int[] array) {
        float averageSum = 0;
        for (int i = 0; i <5 ; i++) {
            averageSum = (averageSum + array[i])/2;
        }
        return averageSum;
    }
}

