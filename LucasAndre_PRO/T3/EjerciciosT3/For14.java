package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For14
{
    public static void main(String[] args)
    {
        System.out.println("Este es un programa que dibuja un cuadrado donde las aristas exteriores tienen '-' y la parte interior '+'.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del cuadrado: ");
        int     ladoX = input.nextInt();
        int     ladoY = ladoX;

        for (int i = 1; i <= ladoX; i++)
        {
            for (int j = 1; j <= ladoY; j++)
            {
                if((i == 1) || (i == ladoX) || (j == 1) || (j == ladoY))
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }    
}
