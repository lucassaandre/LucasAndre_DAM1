package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este es un programa para calcular las tablas de multiplicar comprendidos entre dos números(incluidos).");
        System.out.println("Introduce el primer número del rango: ");
        int     num1 = input.nextInt();
        System.out.println("Introduce el último número del rango: ");
        int     num2 = input.nextInt();

        for (int i = num1; i <= num2; i++)
        {
            for (int j = 0; j <= 10; j++)
            {
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
    }
}
