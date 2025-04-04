package com.selflearning.program.String;

public class Lecture30b {
    public static void main(String[] args) {
        System.out.println(stringEndsWithAString("Powerful", "ful"));
        int[] arr = new int[100];
        int x =arr[1]++;
        System.out.println(x);
    }

    public static boolean stringEndsWithAString(String word, String subWord) {
        boolean flag = false;

        for (int i = word.length() - 1, j = subWord.length() - 1; j >= 0; i--, j--) {
            if (word.charAt(i) == subWord.charAt(j)) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
