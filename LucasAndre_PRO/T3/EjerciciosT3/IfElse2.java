package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int num3 = input.nextInt();

        if(num1 == num2 + num3)
        {
            System.out.println(num1 + " = " + num2 + " + " + num3);
        }
        else if(num2 == num1 + num3)
        {
            System.out.println(num2 + " = " + num1 + " + " + num3);
        }
        else if(num3 == num1 + num2)
        {
            System.out.println(num3 + " = " + num1 + " + " + num2);
        }
        else
        {
            System.out.println("Ninguno es suma de los otros dos");
        }
    }
}
