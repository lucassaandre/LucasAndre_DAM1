import java.util.Scanner;

public class ArrayUni6
{
    public static void main(String[] args)
    {
        System.out.println("Introduce la longitud de tu array: ");    
        int[] array = new int[new Scanner(System.in).nextInt()];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Introduce el número "+(i+1)+" de tu array: ");
            array[i] = new Scanner(System.in).nextInt();    
        }
        System.out.println("Array creado: ");
        for (int i : array)
        {
            System.out.printf("%d, ", i);
        }
        System.out.println();
        System.out.println("Array desplazado hacia la derecha: ");
        int primero = array[0];
        int aux;
        for (int i = array.length - 1; i > 0; i--)
        {
            if(i > 0)
            {
                aux = array[i];
                array[i] = array[i-1];
                array[i-1] = aux; 
                System.out.printf("%d, ", array[i]);
            }
        }
        System.out.printf("%d\n", primero);
    }    
}
