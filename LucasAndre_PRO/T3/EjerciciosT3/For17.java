package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For17
{
    public static void main(String[] args)
    {
        System.out.println("Este programa reconoce frases palíndromo (sin tener en cuenta mayúsculas ni acentos).");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase para comprobar si es palíndromo: ");
        String  word = input.nextLine();
        word = word.toLowerCase();
        word = word.replace(" ", "");
        word = word.replace("á", "a");
        word = word.replace("é", "e");
        word = word.replace("í", "i");
        word = word.replace("ó", "o");
        word = word.replace("ú", "u");
        boolean palindromo = false;

        for (int i = 0; i < word.length() / 2; i++)
        {
            if(word.charAt(i) == word.charAt(word.length() - 1 - i))
            {
                palindromo = true;
            }
            else
            {
                palindromo = false;
                break;
            }
        }
        System.out.println("La frase es palíndromo: " + palindromo);
    }    
}
