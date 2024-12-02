package Day12_Strings;

import java.util.Arrays;

public class RemovingVowelsFromStatements
{
    public static void main(String[] args) {

        removingVowels("What entry i thought ");
    }

    public static void removingVowels(String statement)
    {
        String[] stats =statement.split(" ");
        for(String s : stats)
        {
            String[] cc = s.split("");
            String expression =" ";
            for(String c: cc)
            {
                if(!(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u")))
                {
                    expression = expression + c;
                }
            }

            System.out.print(expression);
        }
    }
}
