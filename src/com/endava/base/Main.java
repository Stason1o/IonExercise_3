package com.endava.base;

import com.endava.util.DataUtils;

/**
 * Created by sbogdanschi on 24/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] array;
        DataUtils dataUtils = new DataUtils();
        array = dataUtils.createArray(2,4);
        dataUtils.fillArray(array);
        dataUtils.printArray(array);
        dataUtils.sortArray(array);
        dataUtils.printArray(array);
    }
}
