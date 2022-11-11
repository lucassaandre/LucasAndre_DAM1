package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile5
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Generando número aleatorio entre 0 y 20...");
        int numSystem = (int) (Math.random()*21);
        System.out.println(numSystem);
        System.out.println("Número aleatorio generado.");
        
        int attemps = 0;
        while(numSystem != numUser())
        {
            attemps++;
            System.out.println("Vaya no es el número, sigue intentándolo");
        }
        System.out.println("Enhorabuena, has acertado el número en " + (attemps + 1) + " intentos");
    }
    private static int numUser()
    {
        System.out.println("Adivina el número: ");
        return input.nextInt();
    }
}
