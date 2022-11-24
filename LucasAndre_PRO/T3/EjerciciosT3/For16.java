import java.util.Scanner;

public class For16
{
    public static void main(String[] args)
    {
        System.out.println("Este programa reconoce palabras palíndromo (sin tener en cuenta mayúsculas ni acentos).");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra para comprobar si es palíndromo: ");
        String  word = input.nextLine();
        boolean palindromo = false;
        
        for (int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == word.charAt(word.length() - 1 - i))
            {
                palindromo = true;
            }
            else
            {
                palindromo = false; 
            }
        }
        System.out.println("La palabra es palíndromo: " + palindromo);
    }
}