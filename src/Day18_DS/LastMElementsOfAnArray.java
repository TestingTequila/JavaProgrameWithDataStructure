package Day18_DS;

public class LastMElementsOfAnArray {
    public static void main(String[] args) {
        printLastMElementsOfArray(new int[]{12, 34, 56, 67, 9, 6, 8}, 5);
    }

    public static void printLastMElementsOfArray(int[] numbers, int lastMElements) {
        for (int i = numbers.length - lastMElements; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
