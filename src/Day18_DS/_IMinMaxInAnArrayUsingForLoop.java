package Day18_DS;

public class _IMinMaxInAnArrayUsingForLoop {
    public static void main(String[] args) {
        minMax(new int[]{12, 45, -67, -7, 5, 31});
    }

    public static void minMax(int[] numbers) {
        int min_value = numbers[0];
        int max_value = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value)
            {
                max_value = numbers[i];
            }
            else if (numbers[i] < min_value)
            {
                min_value = numbers[i];
            }
        }
        System.out.println("min_value: " + min_value);
        System.out.println("max_value: " + max_value);
    }
}
