import java.util.Scanner;

public class EjerciciosArrayBase
{
    public static void main(String[] args)
    {
        //partOne();
        System.out.println("Current time in seconds: ");
        System.out.println(System.currentTimeMillis()/100);
    }

    private static void partOne()
    {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++)
        {
            numero[i] = (int) (Math.pow(numero[i], 2));;
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
        }
        System.out.println("Número\t\tCuadrado\t\tCubo");
    }
}
