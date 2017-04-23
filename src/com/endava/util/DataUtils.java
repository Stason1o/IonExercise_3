package com.endava.util;

/**
 * Created by sbogdanschi on 24/03/2017.
 */
public class DataUtils {

    public int[] createArray(int a, int b) {
        return new int[a * b];
    }

    public double[] createArray(double a, double b) {
        return new double[(int) (a * b)];
    }

    public float[] createArray(float a, float b) {
        return new float[(int) (a * b)];
    }

    public char[] createArray(char a, char b) {
        System.out.println(a * b);
        return new char[a * b];
    }

    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500);
        }
    }

    public void fillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 500;
        }
    }

    public void fillArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * 500);
        }
    }

    public void fillArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (33 + (Math.random() * 90));
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 8 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 8 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public void printArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 8 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 8 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public void sortArray(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void sortArray(double[] array) {
        double tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void sortArray(float[] array) {
        float tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void sortArray(char[] array) {
        char tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
