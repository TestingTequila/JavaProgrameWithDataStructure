package com.selflearning.program.String;

public class Lecture32b {
    public static void main(String[] args) {

        if (findGold("This is Gold mine", "gold")) {
            System.out.println("Given Substring exists in statement");
        } else {
            System.out.println("Given Substring does not exists in statement");
        }
    }

    public static boolean findGold(String statement, String subString) {
        String newStatement = statement.toUpperCase();
        String newsubString = subString.toUpperCase();
        return newStatement.contains(newsubString);
    }

}
