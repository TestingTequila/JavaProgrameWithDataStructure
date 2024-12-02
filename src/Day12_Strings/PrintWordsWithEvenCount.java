package Day12_Strings;

public class PrintWordsWithEvenCount
{
    public static void main(String[] args) {
        evenCountWords("This is amazing experience brother");
    }

    public static void evenCountWords(String statement)
    {
        String[] stats= statement.split(" ");
        for(String st:stats)
        {
            int count= st.length();
            if(count%2==0)
            {
                System.out.println(st);
            }
        }
    }
}
