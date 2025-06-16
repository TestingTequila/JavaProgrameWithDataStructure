package com.chatgpt.dsquestions;

import java.util.*;

public class MoveAllZerosAtTheEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosAtTheEnd(new int[]{12, 0, 34, 0, 5, 6, 0, 9})));
    }
    //12,34,5,6,9,0,0,0

    public static int[] moveAllZerosAtTheEnd(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[i] = num;
                i++;
            }

        }
        for( int j=i;j<arr.length; j++ )
        {
            arr[j]=0;
        }
        return arr;
    }
}
