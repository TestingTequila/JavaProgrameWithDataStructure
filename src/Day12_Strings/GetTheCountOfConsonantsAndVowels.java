package Day12_Strings;

public class GetTheCountOfConsonantsAndVowels
{
    public static void main(String[] args) {
        getVowelsAndConsonantsCount("This is amazing");
    }

    public static void getVowelsAndConsonantsCount(String statement)
    {
        String[] words = statement.split(" ");
        int vowelsCount = 0;
        int consonantsCount=0;
        for(String w: words)
        {
            String[] letters = w.split("");
            for(String l : letters)
            {
                if((l.equalsIgnoreCase("a")||l.equalsIgnoreCase("e")||l.equalsIgnoreCase("i")||l.equalsIgnoreCase("o")||l.equalsIgnoreCase("u")))
                {
                    vowelsCount++;
                }
                else
                {
                    if(!(l.equalsIgnoreCase(" "))) {
                        consonantsCount++;
                    }
                }
            }
        }

        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
    }
}
