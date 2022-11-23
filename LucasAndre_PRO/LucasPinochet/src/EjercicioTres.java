import java.util.Arrays;
import java.util.Scanner;

public class EjercicioTres
{
    public static void main(String[] args)
    {
        int[] numbers = new int[20];
        System.out.println("Se ha creado un array de 20 números.");
        Scanner input = new Scanner(System.in);
        String letterUser;
        do
        {
        System.out.printf("Seleccione una de las siguientes opciones:\nA. Registrar posiciones\n" +
                "B. Obtener elementos de una posición específica\nC. Mostrar el array completo\n" +
                "D. Mostrar el array ordenado\nE. Rotar el array\n");
        letterUser = input.next();

        switch (letterUser)
        {
            case "A", "a":
            {
                for (int i = 0; i < numbers.length; i++)
                {
                    System.out.println("Introduzca el "+(i+1)+"º número en la posición "+i+": ");
                    numbers[i] = input.nextInt();
                }
                break;
            }
            case "B", "b":
            {
                System.out.println("Seleccione la posición que desea consultar: ");
                int posUser = input.nextInt();
                System.out.println("El número en la posición "+posUser+" es "+numbers[posUser]);
                break;
            }
            case "C", "c":
            {
                for (int n: numbers)
                {
                    System.out.printf("%d, ", n);
                }
                System.out.println();
            }
        }

        }
        while(letterUser.equalsIgnoreCase("A") || letterUser.equalsIgnoreCase("B") ||
                letterUser.equalsIgnoreCase("C") || letterUser.equalsIgnoreCase("D") ||
                letterUser.equalsIgnoreCase("E"));
    }
}
