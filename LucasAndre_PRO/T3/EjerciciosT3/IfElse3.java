package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número a evaluar: ");
        int     num = input.nextInt();

        if(num % 20 == 0 && (num >= -100 && num <= 100))
        {
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        }
        else if(num % 20 == 0 && (num < -100 || num > 100))
        {
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        }
        else if(num % 20 != 0 && (num >= -100 && num <= 100))
        {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        }
        else if(num % 20 != 0 && (num < -100 || num > 100))
        {
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }
    }
}
