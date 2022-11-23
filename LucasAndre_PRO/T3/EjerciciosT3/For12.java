package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For12
{
    public static void main(String[] args)
    {
        System.out.println("Este programa pide la cantidad de sueldos que quieres introducir y te muestra el sueldo máximo introducido.");
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nº de sueldos que quieres introducir: ");
        int nSalaries = input.nextInt();

        double salary;
        double max = -1;
        for (int i = 1; i <= nSalaries; i++)
        {
            System.out.println("Introduce el "+i+"º sueldo: ");
            salary = input.nextDouble();
            if(salary > max)
            {
                max = salary;
            }
        }
        System.out.printf("El salario máximo introducido es de %.2f€", max);
    }    
}
