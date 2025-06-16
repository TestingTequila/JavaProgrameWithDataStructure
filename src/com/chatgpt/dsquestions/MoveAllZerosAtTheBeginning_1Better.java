package com.chatgpt.dsquestions;

import java.util.Arrays;

public class MoveAllZerosAtTheBeginning_1Better
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosAtTheBeginning(new int[]{12, 0, 34, 0, 5, 6, 0, 9})));
    }

    public static  int[] moveAllZerosAtTheBeginning(int[] numbers)
    {
        int i = numbers.length-1;
        for(int num : numbers)
        {

            if(num!=0)
            {
                numbers[i]=num;
                i--;
            }
        }
        for(int j=i; j>=0; j--)
        {
            numbers[j]=0;
        }

        return numbers;
    }
}
