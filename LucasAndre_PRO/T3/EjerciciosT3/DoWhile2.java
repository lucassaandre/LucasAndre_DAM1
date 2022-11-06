/*Este programa ha sido diseñado de tal manera que vuelve a preguntar al usuario
por cualquiera de los dos valores introducidos independientemente de su orden,
hasta que se introduzcan valores dentro del rango establecido (1 - 100)*/

package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile2
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int num1 = num(0);
        while(!minMax(num1))
        {
            num1 = num(1);
        }
        if(minMax(num1))
        {
            int num2 = num(0);
            while(!minMax(num2))
            {
                num2 = num(1);
            }
            int     max = Math.max(num1, num2);
            int     i = max;
            if(minMax(num1) && minMax(num2))
            {
                while(i % num1 != 0 || i % num2 != 0)
                {
                    i++;
                }
                System.out.println("El mcm de "+num1+" y de "+num2+" es: "+i);
            }
        }
    }
    private static boolean minMax(int num)
    {
        return num > 0 && num < 101;
    }
    private static int num(int indicator)
    {
        if(indicator == 0)
        {
            //TODO: cambiar el mensaje introduce primer número y segundo número
            System.out.println("Introduce un número entre 1 y 100: ");
            return input.nextInt();
        }
        else
        {
            //TODO: Imprimir el número que se ha introducido fuera de rango junto con el mensaje de abajo
            System.out.println("Es un valor fuera de rango, por favor introduzca números entre 1 y 100.");
            return input.nextInt();
        }
    }
}
