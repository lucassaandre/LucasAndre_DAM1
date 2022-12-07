import java.util.Scanner;

public class ArrayUni6
{
    public static void main(String[] args)
    {
        System.out.println("Introduzca la longitud de su array: ");
        int[] myArray = new int[new Scanner(System.in).nextInt()];
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println("Introduzca el número "+(i+1)+" de su array: ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Array creado: ");
        for (int i : myArray)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
        arrayDer(myArray);
        arrayIzq(myArray);
    }
    public static void arrayDer(int[] array)
    {
        System.out.println("Array desplazado hacia la derecha: ");
        int auxDer = array[array.length - 1];
        for (int i = array.length - 1; i >= 1; i--)
        {
            array[i] = array[i-1];
        }
        array[0] = auxDer;
        for (int i : array)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
    }
    public static void arrayIzq(int[] array)
    {
        System.out.println("Array desplazado hacia la izquierda: ");
        int auxIzq = array[0];
        for (int i = 0; i < array.length - 1; i++)
        {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = auxIzq;
        for (int i : array)
        {    
            System.out.printf("%d, ", i);    
        }
        System.out.println();
    }
}
