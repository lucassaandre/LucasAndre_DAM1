package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número de tres dígitos: ");
        int     num = input.nextInt();

        if(num >= 100 && num <= 999)
        {
            int     n1 = num / 100;
            int     n2 = (num % 100) / 10;
            int     n3 = num % 10;
            if((Math.pow(n1, 3)) + (Math.pow(n2, 3)) + (Math.pow(n3, 3)) == num)
            {
                System.out.println("Es un número Armstrong");
            }
            else
            {
                System.out.println("No es un número Armstrong");
            }
        }
        else
        {
            System.out.println("El número no tiene 3 dígitos");
        }
    }    
}
