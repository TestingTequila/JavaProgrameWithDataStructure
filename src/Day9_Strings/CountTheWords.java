package Day9_Strings;

public class CountTheWords
{
    public static void main(String[] args) {
        wordCount("My Name is Anthony Gonzalvez and i am a disco dancer");
    }

    public static void wordCount(String statement)
    {
        String[] myStatement=statement.split(" ");
        System.out.println(myStatement.length);
    }
}
