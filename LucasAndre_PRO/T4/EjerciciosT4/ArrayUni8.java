import java.util.Scanner;

public class ArrayUni8
{
    public static void main(String[] args)
    {
        System.out.println("Introduzca una frase: ");
        String      frase = new Scanner(System.in).nextLine();
        String[]    words = frase.split(" ");
        String      lon = words[0];
        String      shor = words[0];
        for (String item : words)
        {
            if(item.length() < shor.length())
            {
                shor = item;
            }
            else if(item.length() > lon.length())
            {
                lon = item;
            }    
        }
        System.out.println("Palabra más larga: "+lon);
        System.out.println("Palabra más corta: "+shor);
    }    
}