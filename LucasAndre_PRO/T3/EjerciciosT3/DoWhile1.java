package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int     num = -1;
        int     suma = 0;

        while(num != 0)
        {
            System.out.println("Introduce un número entero");
            num = input.nextInt();
            suma += num;
        }
        System.out.println("La suma total es " + suma);
    }
}
