package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número de temperaturas que desea introducir para calcular su media: ");
        int     Ntemp = input.nextInt();
        if(Ntemp < 1)
        {
            Ntemp = 10;
        }
        double temp;
        double suma = 0;
        for (int i = 0; i < Ntemp; i++)
        {
            System.out.println("Introduzca temperatura: ");
            temp = input.nextDouble();
            suma += temp;
        }
        System.out.printf("La media de las temperaturas es de %.2fºC\n", suma/Ntemp);
    }    
}
