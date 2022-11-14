package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este programa te muestra la tabla de multiplicar del 0 hasta el 10 del número que desees.");
        System.out.println("Introduce el nº de la tabla de multiplicar que quieres ver: ");
        int     num = input.nextInt();

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }    
}
