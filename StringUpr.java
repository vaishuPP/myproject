import java.util.Arrays;
import java.util.Locale;

public class StringUpr {
    public static void main(String args[])
    {
        String phrase= "Hello Everyone67&*89";
        System.out.println(phrase);
        //to upper and lower
        System.out.println("Uppercase:" + phrase.toUpperCase());
        System.out.println("lowercase:" + phrase.toLowerCase());
        //length
        System.out.println("length of text is "+ phrase.length());
        //reverse
        StringBuffer obj1 = new StringBuffer(phrase);
        System.out.println(obj1.reverse());
        StringBuilder obj2 =new StringBuilder("Indira Priyadarshini");
        System.out.println(obj2.reverse());
        //Using forloop for reverse
        char[] phraseArray = phrase.toCharArray();
        int k = phraseArray.length;
        for (int i=k-1; i>=0; i--)
        {
            System.out.print(phraseArray[i]);
        }



            }

}
