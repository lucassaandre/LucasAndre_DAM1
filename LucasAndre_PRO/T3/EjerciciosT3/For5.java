package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int     num;
        do
        {
            System.out.println("Introduce un nº entre 0 - 20 para calcular su factorial: ");
            num = input.nextInt();
            if(num < 0 || num > 20)
            {
                System.out.println("Número fuera de rango, por favor introduce un número enre 0 - 20.");
            }
        }
        while(num < 0 || num > 20);

        int factorial = 1;
        for (int i = num; i > 0 ; i--)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }    
}
