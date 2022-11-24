package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For13
{
    public static void main(String[] args)
    {
        System.out.println("Este programa dibuja un cuadrado de 'x' con el tamaño de sus lados deseado.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del cuadrado de 'x': ");
        int ladoX = input.nextInt();
        int ladoY = ladoX;

        for (int i = 1; i <= ladoX; i++)
        {
            for (int j = 1; j <= ladoY; j++)
            {
                if((i == 1) || (i == ladoX) || (j == 1) || (j == ladoY))
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}