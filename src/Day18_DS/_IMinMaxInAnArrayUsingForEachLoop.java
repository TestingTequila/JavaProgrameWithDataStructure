package Day18_DS;

public class _IMinMaxInAnArrayUsingForEachLoop {
    public static void main(String[] args) {
        minMax(new int[]{12, 45, -67, -7, 5, 31});
    }

    public static void minMax(int[] numbers) {
        int min_value = numbers[0];
        int max_value = numbers[0];
        for (int num : numbers)
        {
            if(num>max_value)
            {
                max_value=num;
            }
            else if (num<min_value)
            {
                min_value=num;
            }
        }
        System.out.println("min_value: " + min_value);
        System.out.println("max_value: " + max_value);
    }
}
