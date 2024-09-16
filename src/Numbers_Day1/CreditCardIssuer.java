package Numbers_Day1;

public class CreditCardIssuer {
    public static void main(String[] args) {
        CreditCardIssuer.creditCardIssuing(803);
    }

    public static void creditCardIssuing(int creditScore) {

        if (creditScore >= 400 && creditScore < 600) {
            System.out.println("Issue a Silver Card");
        } else if (creditScore >= 600 && creditScore < 800) {
            System.out.println("Issue a Gold Card");
        } else if (creditScore >= 800 && creditScore < 850) {
            System.out.println("Issue a Platinum Card");
        } else {
            System.out.println(creditScore + " is invalid credit score...");
        }
    }
}

