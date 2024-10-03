package Day9_Strings;

public class StringEndsWithAString
{
    public static void main(String[] args) {
        stringEndsWithOtherString("Merc", "Merc");
    }

    public static void stringEndsWithOtherString(String fString, String sString)
    {
        int lengthOfSecondString = sString.length();
        if(fString.length()==lengthOfSecondString)
        {
            System.out.println(fString.equals(sString)?fString+ " endszz with " + sString : fString+ " does not ends with" + sString);
        }
        else
        {
            String word ="";
            for(int i = fString.length()-sString.length(); i<fString.length(); i++)
            {
                word =word + fString.charAt(i);
            }

            System.out.println(word.equals(sString)?fString + " ends with " + sString:fString + " does not ends with " + sString);
        }
    }
}
