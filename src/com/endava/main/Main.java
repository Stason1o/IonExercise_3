package com.endava.main;

import com.endava.util.DataUtils;

/**
 * Created by sbogdanschi on 24/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] intArray;
        double[] doubleArray;
        float[] floatArray;
        char[] charArray;
        DataUtils dataUtils = new DataUtils();

        System.out.println("-----------------INTEGER-------------------");
        intArray = dataUtils.createArray(2,4);
        dataUtils.fillArray(intArray);
        dataUtils.sortArray(intArray);
        dataUtils.printArray(intArray);
        System.out.println("-----------------DOUBLE-------------------");
        doubleArray = dataUtils.createArray(3.0, 5.2);
        dataUtils.fillArray(doubleArray);
        dataUtils.sortArray(doubleArray);
        dataUtils.printArray(doubleArray);
        System.out.println("-----------------FLOAT-------------------");
        floatArray = dataUtils.createArray(4.0f, 3.6f);
        dataUtils.fillArray(floatArray);
        dataUtils.sortArray(floatArray);
        dataUtils.printArray(floatArray);
        System.out.println("-----------------CHAR-------------------");
        charArray = dataUtils.createArray('!', 'a');
        dataUtils.fillArray(charArray);
        dataUtils.sortArray(charArray);
        dataUtils.printArray(charArray);

        }
}
