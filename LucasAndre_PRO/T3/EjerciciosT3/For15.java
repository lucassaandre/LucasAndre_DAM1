import java.util.Scanner;

public class For15
{
    public static void main(String[] args)
    {
        System.out.println("Este programa pide una palabra por teclado y muestra su contraria.");
        Scanner input = new Scanner(System.in);
        String  word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--)
        {
            System.out.print(word.charAt(i));    
        }
        System.out.println();
    }    
}
