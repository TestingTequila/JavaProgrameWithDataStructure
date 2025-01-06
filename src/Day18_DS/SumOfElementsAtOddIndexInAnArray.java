package Day18_DS;

public class SumOfElementsAtOddIndexInAnArray {
    public static void main(String[] args) {
        additionOfElementsAtOddIndex(new int[]{1, 12, 23, 4, 6, 8, 9, 6});
    }

    public static void additionOfElementsAtOddIndex(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("SUM: " + sum);
    }
}
