package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este es un programa que simula el lanzamiento de un dado.");
        System.out.println("Por favor introduzca las veces que quiera que sea lanzado el dado: ");
        int nLanzamientos = input.nextInt();
        if(nLanzamientos < 0)
        {
            nLanzamientos = 100;
        }

        int dado = 0;
        for (int i = 0; i < nLanzamientos; i++)
        {
            System.out.println(dado = (int)(Math.random()*(6 - 1 + 1) + 1));
        }
        System.out.println("El resultado del dado es "+dado);
    }    
}
