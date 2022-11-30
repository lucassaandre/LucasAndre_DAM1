import java.util.Scanner;

public class ArrayUni4
{
    public static void main(String[] args)
    {
        System.out.println("Introduce la longitud del array de enteros: ");
        int[] enteros = new int[new Scanner(System.in).nextInt()];
        int mayor = -1;
        int menor = 99999999;
        for (int i = 0; i < enteros.length; i++)
        {
            System.out.println("Introduce el valor para el nº "+(i+1)+" en la posición "+i+" del array: ");
            enteros[i] = new Scanner(System.in).nextInt();
            if(enteros[i] > mayor)
            {
                mayor = enteros[i];
            }
            if(enteros[i] < menor)
            {
                menor = enteros[i];
            }
        }
        System.out.println("El nº mayor es "+mayor);
        System.out.println("El nº menor es "+menor);
    }
}
