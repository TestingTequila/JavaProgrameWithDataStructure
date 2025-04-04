package Day24_Sorting;

public class LinearSearch
{
    public static void main(String[] args) {
        System.out.println(searchElement(new int[]{25,35,15,10}, 10));
    }

    public static   int searchElement(int[] numbers, int number)
    {
        int myNumber= -1;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==number)
            {
                myNumber= numbers[i];
            }
        }
        return myNumber;
    }
}
