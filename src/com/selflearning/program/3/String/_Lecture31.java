package com.selflearning.program.String;

public class _Lecture31 {
    public static void main(String[] args) {
        findMaxOccurrences("aa bcd nnnan");

    }

    public static void findMaxOccurrences(String s) {
        int[] arr = new int[256];

        for(int i=0; i<s.length(); i++)
        {
            int index = (int)s.charAt(i);
            arr[index]++;//This will increase the value stored at particular index by 1
        }

        int firstNumber = 0;
        for(int secondNumber=1; secondNumber<arr.length; secondNumber++)
        {
            if(arr[secondNumber]>arr[firstNumber])
            {
                firstNumber = secondNumber;
            }
        }
        System.out.println("max Occurring letter is:  " + (char)firstNumber);


    }
}
