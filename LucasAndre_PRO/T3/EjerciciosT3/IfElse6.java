package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número entre -100 y 100: ");
        double  num1 = input.nextDouble();
        System.out.println("Introduce el segundo número entre -100 y 100: ");
        double  num2 = input.nextDouble();
        System.out.println("Introduce el tercer número entre -100 y 100: ");
        double  num3 = input.nextDouble();

        if((num1 >= -100 && num1 <= 100) && (num2 >= -100 && num2 <= 100) && (num3 >= -100 && num3 <= 100))
        {
            if(num1 == 0)
            {
                System.out.printf("1/%.2f + 1/%.2f = %.2f\n", num2, num3, (1/num2 + 1/num3));
            }
            else if(num2 == 0)
            {
                System.out.printf("1/%.2f + 1/%.2f = %.2f\n", num1, num3, (1/num1 + 1/num3));
            }
            else if(num3 == 0)
            {
                System.out.printf("1/%.2f + 1/%.2f = %.2f\n", num1, num2, (1/num1 + 1/num2));
            }
            else
            {
                System.out.printf("1/%.2f + 1/%.2f + 1/%.2f = %.2f\n", num1, num2, num3, (1/num1 + 1/num2 + 1/num3));
            }
        }
        else
        {
            System.out.println("Alguno de los números no está entre -100 y 100");
        }
    }
}
