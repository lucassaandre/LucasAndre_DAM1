package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class ifElse4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el año: ");
        int     year = input.nextInt();

        if(year % 4 == 0)
        {
            System.out.println("Es bisiesto");
        }
        else
        {
            System.out.println("No es bisiesto");
        }
    }
}
