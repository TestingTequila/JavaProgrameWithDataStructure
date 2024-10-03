package Day9_Strings;

public class CountTheWords2
{
    public static void main(String[] args) {
        countTheWords("My Name is Anthony Gonzalvez and i am a disco dancer");
    }

    public static void countTheWords(String statement)
    {
        int count =1;
        for(int i= 0; i<statement.length(); i++ )
        {
            if(statement.charAt(i)==' ')
            {
                count++;
            }
        }

        System.out.println("Total Word count in given statement is: " + count);
    }
}
