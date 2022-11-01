package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        int num = input.nextInt();
        incremento(num);
    }
    private static void incremento(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num + 1);
        }
        else
        {
            System.out.println(num - 1);
        }
    }
}
