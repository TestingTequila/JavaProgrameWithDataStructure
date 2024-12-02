package Day5_Numbers;

public class _19FibonacciSeries_Misc {
    public static void main(String[] args) {
        printFibonacciSeries(10);
    }

    public static void printFibonacciSeries(int number) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2);

        for(int i=2; i<number;i++)
        {
            n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }

    }
}
