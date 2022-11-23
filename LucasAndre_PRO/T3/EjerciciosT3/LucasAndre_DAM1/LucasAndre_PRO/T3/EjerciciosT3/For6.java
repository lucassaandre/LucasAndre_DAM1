package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este es un programa para obtener la potencia de un nº.");
        int base;
        do
        {
            System.out.println("Introduce la base (0 -5): ");
            base = input.nextInt();
            if(base < 0 || base > 5)
            {
                System.out.println("Número fuera de rango. Por favor, introduce un número entre 0 - 5.");
            }
        }
        while(base < 0 || base > 5);
        int exp;
        do
        {
            System.out.println("Introduce el exponente (0 - 5): ");
            exp = input.nextInt();
            if(exp < 0 || exp > 5)
            {
                System.out.println("Número fuera de rango. Por favor, introduce un número entre 0 - 5.");
            }
        }
        while(exp < 0 || exp > 5);
        
        int potencia = 1;
        for (int i = 0; i < exp; i++)
        {
            potencia *= base;
        }
        System.out.println("El resultado de "+base+"^"+exp+" es "+potencia);
    }    
}
