import java.util.Scanner;

public class ArrayUni5
{
    public static void main(String[] args)
    {
        System.out.println("Introduce la longitud para 2 arrays de enteros: ");
        int[] arrayUno = new int[new Scanner(System.in).nextInt()];
        int[] arrayDos = new int[arrayUno.length];

        for (int i = 0; i < arrayUno.length; i++)
        {
            System.out.println("Introduce el "+(i+1)+"º número del primer array: ");
            arrayUno[i] = new Scanner(System.in).nextInt();   
            System.out.println("Introduce el "+(i+1)+"º número del segundo array: ");
            arrayDos[i] = new Scanner(System.in).nextInt();   
        }
        //creación y relleno de arrayTres con suma de posiciones de arrayUno y arrayDos
        int[] arrayTres = new int[arrayUno.length];
        for (int i = 0; i < arrayTres.length; i++)
        {
            arrayTres[i] = arrayUno[i] + arrayDos[i];    
        }
        System.out.printf("Números arrayTres: ");
        for (int i : arrayTres)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
    }    
}