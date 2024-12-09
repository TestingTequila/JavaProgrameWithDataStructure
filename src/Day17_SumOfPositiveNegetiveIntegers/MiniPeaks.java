package Day17_SumOfPositiveNegetiveIntegers;

public class MiniPeaks
{
    public static void main(String[] args) {
        miniPeaks(new int[]{1, 3,2,4,5,2});
    }

    public static void miniPeaks(int[] numbers)
    {
        for(int i=1; i<numbers.length;i++)
        {
            if(i+1<numbers.length) {
                if (numbers[i] > numbers[i + 1] && numbers[i] > numbers[i - 1]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
