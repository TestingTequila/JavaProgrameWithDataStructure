package Day1_Numbers;

public class _1EvenOrOdd
{
    public static void main(String[] args) {
        _1EvenOrOdd.evenOdd(-120);
    }
    public static  void evenOdd(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(number + " is an invalid number");
        } else {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
        }
    }
}
