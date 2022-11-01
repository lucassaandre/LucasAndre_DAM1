package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int     num1 = input.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int     num2 = input.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int     num3 = input.nextInt();
        areConsecutives(num1, num2, num3);   
    }
    private static void areConsecutives(int num1, int num2, int num3)
    {
        if(num2 == num1+1 && num3 == num2+1)
        {
            System.out.println("Son consecutivos");
        }
        else
        {
            System.out.println("No son consecutivos");
        }
    }
}
