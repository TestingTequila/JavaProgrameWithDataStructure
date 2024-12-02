package Day11_Strings;

public class RemoveVowelsFromGivenStatement
{
    public static void main(String[] args) {
        removeVowels("i am a bachelor not interested in getting married");
    }

    public static void removeVowels(String statement)
    {
        char[] vowels ={'a','e','i','o','u'};
        String myStat="";
        for(int i =0; i <statement.length(); i++)
        {
            char ch= statement.charAt(i);
            for(char c: vowels)
            {
                if(c==ch)
                {
                   myStat= myStat+ statement.replace(ch, ' ');
                }
            }
        }
        System.out.println(myStat);
    }
}
