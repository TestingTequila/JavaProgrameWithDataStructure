package Day11_Strings;

public class FindGivenWordInStatement
{
    public static void main(String[] args) {
        findWordInStatement("I am buying Gold Tonight", "buying");
    }

    public static void findWordInStatement(String statement, String word)
    {
        String[] myStatement= statement.split(" ");
        for (String s: myStatement)
        {
           if(s.equals(word))
           {
               System.out.println(word + " exists in the statement given");
               break;
           }
        }
        System.out.println(word + " does not exists in the statement given");
    }
}
