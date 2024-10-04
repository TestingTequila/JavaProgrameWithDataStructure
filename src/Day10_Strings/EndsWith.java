package Day10_Strings;

public class EndsWith
{
    public static void main(String[] args) {
        endsWithWord("Selenium", "nium");
    }

    public static void endsWithWord(String word1, String word2)
    {
        System.out.println(word1.endsWith(word2)?word1 + " ends with " + word2:word1 + " does not ends with " + word1);
    }
}
