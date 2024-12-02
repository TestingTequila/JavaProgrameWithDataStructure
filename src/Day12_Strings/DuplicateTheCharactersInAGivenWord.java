package Day12_Strings;

public class DuplicateTheCharactersInAGivenWord
{
    public static void main(String[] args) {
        duplicateCharacters("Ashish");
    }

    public static void duplicateCharacters(String word)
    {
        String[] str =word.split("");
        String newWord="";
        for(String s: str)
        {
            newWord = newWord+s+s;
        }

        System.out.println(newWord);
    }
}
