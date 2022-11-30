package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For18
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido al juego de adivinación de números.");
        Scanner input = new Scanner(System.in);
        System.out.println("Generando número aleatorio entre 1 - 30...");
        int     random = (int)(Math.random() * (31 - 1) + 1);
        System.out.println("Número generado.");
        System.out.print(random);
        int     attempsGame = 10;
        int     attemps = 10;
        System.out.println("Tienes "+attemps+" intentos.");
        int     numUser = 0;

        do
        {
            attemps--;
            System.out.println("Introduce un número: ");
            numUser = input.nextInt();
            if(numUser != random && attemps > 0)
            {
                System.out.println("Lo siento no es el número, inténtalo de nuevo. Te quedan " +attemps+" intentos.");
            }
            else if(attemps < 0)
            {
                System.out.println("Lo siento, has agotado todos los intentos.");
            }
        }
        while(numUser != random && attemps > 0);

        if(attemps > 0)
        {
            System.out.println("¡Enhorabuena! Has acertado el número en "+(attempsGame - attemps)+" intentos.");
        }
    }    
}
