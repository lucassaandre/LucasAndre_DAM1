package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este programa te pide 10 sueldos. Muestra su suma, media y cuántos hay mayores de 1000€.");
        double salary;
        double suma = 0.0;
        int nBiggerOneThousand = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Introduce el "+i+"º sueldo: ");
            salary = input.nextDouble();
            suma += salary;
            if(salary > 1000)
            {
                nBiggerOneThousand++;
            }
        }
        System.out.printf("La suma de los sueldos introducidos es de %.2f€\n", suma);
        System.out.printf("La media de los sueldos introducidos es de %.2f€\n", suma/10);
        System.out.println("La cantidad de sueldos mayores de 1000€ son "+nBiggerOneThousand+" sueldos.");
    }    
}
