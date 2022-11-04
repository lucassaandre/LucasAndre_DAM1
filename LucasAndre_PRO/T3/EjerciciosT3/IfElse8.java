package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse8
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
        order(num1, num2, num3);
    }
    public static void order(int num1,int num2, int num3)
    {
        if(num1 > num2 && num1 > num3 && num2 > num3)
        {
            System.out.printf("%d, %d, %d\n", num3, num2, num1);
        }
        else if(num1 > num2 && num1 > num3 && num3 > num2)
        {
            System.out.printf("%d, %d, %d\n", num2, num3, num1);
        }
        else if(num2 > num1 && num2 > num3 && num1 > num3)
        {
            System.out.printf("%d, %d, %d\n", num3, num1, num2);
        }
        else if(num2 > num1 && num2 > num3 && num3 > num1)
        {
            System.out.printf("%d, %d, %d\n", num1, num3, num2);
        }
        else if(num3 > num1 && num3 > num2 && num1 > num2)
        {
            System.out.printf("%d, %d, %d\n", num2, num1, num3);
        }
        else if(num3 > num1 && num3 > num2 && num2 > num1)
        {
            System.out.printf("%d, %d, %d\n", num1, num2, num3);
        }
        else
        {
            System.out.println("Algo ha ido mal");
        }
    }
}
