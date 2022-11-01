package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int     num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + 2);
        }
        else if(num % 3 == 0)
        {
            System.out.println(num + 3);
        }
        else if(num % 5 == 0)
        {
            System.out.println(num + 5);
        }
        else
        {
            System.out.println(num + 1);
        }
    }
}
