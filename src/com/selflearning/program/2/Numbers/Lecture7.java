package com.selflearning.program.Numbers;

public class Lecture7 {
    public static void main(String[] args) {
        creditCardIssuer(250);
    }

    public static void creditCardIssuer(int creditScore) {
        if (creditScore >= 400 && creditScore < 600) {
            System.out.println(creditScore + " : credit score is eligible for Silver Card");
        } else if (creditScore >= 600 && creditScore < 800) {
            System.out.println(creditScore + " : credit score is eligible for Gold Card");
        } else if (creditScore >= 800 && creditScore < 850) {
            System.out.println(creditScore + " : credit score is eligible for Platinum Card");
        }
        else
        {
            System.out.println(creditScore + ": credit score is not eligible for credit card....");
        }
    }
}
