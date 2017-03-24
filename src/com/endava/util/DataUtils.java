package com.endava.util;

/**
 * Created by sbogdanschi on 24/03/2017.
 */
public class DataUtils {

    public int[] createArray(int a, int b){
        int array[] = new int[a * b];
        return array;
    }

    public double[] createArray(double a, double b){
        double array[] = new double[(int)(a * b)];
        return array;
    }

    public float[] createArray(float a, float b){
        float array[] = new float[(int)( a * b)];
        return array;
    }

    public int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 500);
        }
        return array;
    }

    public double[] fillArray(double[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random() * 500;
        }
        return array;
    }

    public float[] fillArray(float[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (float)(Math.random() * 500);
        }
        return array;
    }


    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void printArray(double[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void printArray(float[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public double[] sortArray(double[] array){
        double tmp;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
