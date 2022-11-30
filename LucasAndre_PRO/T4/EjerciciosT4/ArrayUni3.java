import java.util.Scanner;

public class ArrayUni3
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        //usuario datos por teclado
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Introduce el número "+(i+1)); 
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i : array)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
        //*2
        for (int i = 0; i < array.length; i++)
        {
            array[i] *= 2;    
        }
        for (int i : array)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
        //suma
        int suma = 0;
        for (int i = 0; i < array.length; i++)
        {
            suma += array[i];    
        }
        System.out.println("La suma es de "+suma);
        System.out.println("La media es de "+(suma/array.length));
    }    
}
