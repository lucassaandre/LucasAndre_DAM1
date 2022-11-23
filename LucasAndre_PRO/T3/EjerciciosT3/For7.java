package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For7
{
    public static void main(String[] args)
    {
        System.out.println("Este programa te muestra todos los nº pares comprendidos entre dos dados.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer nº: ");
        int     num1 = input.nextInt();
        System.out.println("Introduce el otro nº: ");
        int     num2 = input.nextInt();
        
        for (int i = num1; i <= num2; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }    
}
