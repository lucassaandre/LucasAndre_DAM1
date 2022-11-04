package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int     num1 = input.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int     num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.println("El primero es mayor que el segundo");
        }
        else
        {
            System.out.println("El primero no es mayor que el segundo");
        }
    }    
}
