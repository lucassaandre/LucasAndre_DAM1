package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este programa te muestra la tabla de multiplicar del 0 hasta el 10");
        int num;
        do
        {
            System.out.println("Introduce el nº de la tabla de multiplicar que quieres ver (0 - 10): ");
            num = input.nextInt();
            if(num < 0 || num > 10)
            {
                System.out.println("Número fuera de rango, por favor introduce un nº entre 0 - 10.");
            }
        }
        while(num < 0 || num > 10);

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);    
        }
    }    
}
