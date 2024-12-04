package Day13_Strings;

import java.util.ArrayList;

public class CheckOrder
{
    public static void main(String[] args) {
        sortTheWord("fghijk");
    }

    public static void sortTheWord(String word)
    {
        char[] letters =word.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(char c : letters)
        {
            list.add((int)c);
        }
        for(int i=0; i<list.size()-1; i++)
        {
            int m=0;
            int n=1;
            while (n<list.size()-1)
            {
                if (list.get(m) < list.get(n))
                {
                    m++;
                    n++;
                }
                else
                {
                    System.out.println("Its not a sorted word");

                }
            }
        }
        System.out.println("Is a sorted word");
    }
}
//Need to learn how to sort a given array