package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Este es un programa para indicar la fecha siguiente a la introducida.");
        System.out.println("Introduce el día: ");
        int     day = input.nextInt();
        System.out.println("Introduce el mes: ");
        int     month = input.nextInt();
        System.out.println("Introduce el año: ");
        int     year = input.nextInt();
        date(day, month, year);
    }
    private static void date(int day, int month, int year)
    {
        if(year >= 1000 && year <= 9999)
        {
            if(month28Days(month))
            {
                if(day >= 1 && day <= 28)
                {
                    if(day == 28)
                    {
                        System.out.println("La fecha siguiente a la introducida (" + day + "/" + month + "/" + year + ") es: 1/" + (month + 1) + "/" + year);
                    }
                    else
                    {
                        System.out.println("La fecha siguiente a la introducida (" + day + "/" + month + "/" + year + ") es: " + (day + 1) + "/" + month + "/" + year);
                    }
                }
                else
                {
                    System.out.println("El día " + day + " es incorrecto, por favor introduzca valores entre 1 - 28 para este mes");
                }
            }
            else if(month30Days(month))
            {
                if(day >= 1 && day <= 30)
                {
                    if(day == 30 && month == 12)
                    {
                        System.out.println("La fecha siguiente a la introducida (" + day + "/" + month + "/" + year + ") es: 1/1/" + (year + 1));
                    }
                    else if(day == 30)
                    {
                        System.out.println("La fecha siguiente a la introducida (" + day + "/" + month + "/" + year + ") es: 1/" + (month + 1) + "/" + year);
                    }
                    else
                    {
                        System.out.println("La fecha siguiente a la introducida (" + day + "/" + month + "/" + year + ") es: " + (day + 1) + "/" + month + "/" + year);
                    }
                }
                else
                {
                    System.out.println("El día " + day + " es incorrecto, por favor introduzca valores entre 1 - 30 para este mes"); 
                }
            }
            else
            {
                System.out.println("El mes " + month + " es incorrecto, por favor introduzca valores entre 1 - 12");
            }
        }
        else
        {
            System.out.println("El año " + year + " es incorrecto, por favor introduzca valores entre 1000 - 9999");
        }
    }
    private static boolean month28Days(int month)
    {
        return month == 2;
    }
    private static boolean month30Days(int month)
    {
        return (month >= 1) && (month <= 12) && (month != 2);
    }
}
