import java.util.Scanner;

public class ArrayUni9
{
    public static void main(String[] args)
    {
        char[] abc = new char['z' - 'a' + 1];
        for (int i = 0; i < abc.length; i++)
        {
            abc[i] = (char)('a' + i);    
        }
        System.out.println(abc);
        System.out.println("Nº de palabras a introducir: ");
        String[] words = new String[new Scanner(System.in).nextInt()];
        int     longi;
        for (int i = 0; i < words.length; i++)
        {
            System.out.println("Longitud palabra "+(i+1)+": ");
            longi = new Scanner(System.in).nextInt();
            for (int j = 0; j < longi; j++)
            {
                if(j == 0)
                {
                    words[i] = "";
                }
                int pos = (int)(Math.random()*26);
                //char letter = abc[pos];
                words[i] += abc[pos];
            }
        }
        for (String string : words)
        {
            System.out.println(string);    
        }
    }    
}
