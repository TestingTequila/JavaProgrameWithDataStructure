package com.chatgpt.dsquestions;

import java.util.Arrays;

public class MoveAllZerosAtTheBeginning {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosAtTheBeginning(new int[]{12, 0, 34, 0, 5, 6, 0, 9})));
    }
    //12,34,5,6,9,0,0,0

    public static int[] moveAllZerosAtTheBeginning(int[] arr) {

        int i = arr.length - 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i--;
            }
        }
        for (int k = 0; k <= i; k++) {
            arr[k] = 0;
        }
        return arr;

    }
}
