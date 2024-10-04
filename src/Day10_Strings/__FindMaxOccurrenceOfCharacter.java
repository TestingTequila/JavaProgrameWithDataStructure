package Day10_Strings;

public class __FindMaxOccurrenceOfCharacter
{
    public static void main(String[] args) {
        maxOccurrence("abcd xyz abc jkl abcd xyz mno");
    }

    public static void maxOccurrence(String s)
    {
        int[] arr = new int[256];
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!=' ') {
                arr[(int) s.charAt(i)]++;
            }
        }

        int max=arr[0];
        for(int j=1; j<arr.length;j++)
        {
            if(arr[j]>max)
            {
                max=j;
            }
        }

        System.out.println("Max occurring character is: " + (char)max);
    }
}
