package Day14_Strings;

public class MiddleOfTheString
{
    public static void main(String[] args) {
        centerOfString("Ashish Is good Boy");
    }

    public static void centerOfString(String word)
    {
        int length =word.length();
        if(length%2==0)
        {
            System.out.println((word.charAt((length-1)/2) + " and " + word.charAt(((length-1)/2)+1)));
        }
        else
        {
            System.out.println(word.charAt((length-1)/2));
        }
    }
}
