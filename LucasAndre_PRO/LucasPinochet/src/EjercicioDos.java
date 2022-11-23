import java.util.Scanner;

public class EjercicioDos
{
    public static void main(String[] args)
    {
        System.out.println("Este programa rellena automáticamente la lista con 10 números aleatorios entre 0 y 20");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random()*21);
        }

        //Imprimo números
        for (int i: numbers)
        {
            System.out.printf("%d, ", i);
        }
        System.out.println();

        int max = -1;
        int min = 30;
        int par = 0;
        int impar = 0;
        for (int n: numbers)
        {
            if(n > max)
            {
                max= n;
            }
            if(n < min)
            {
                min = n;
            }
            if(n % 2 == 0)
            {
                par++;
            }
            if(n % 2 != 0)
            {
                impar++;
            }
        }
        System.out.println("El nº máx es: "+max);
        System.out.println("El nº mín. es: "+min);
        System.out.println("Hay "+par+" elementos pares");
        System.out.println("Hay "+impar+" elementos impares");

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un nº para ver cuántas veces aparece en la lista: ");
        int numUser = input.nextInt();

        int nVeces = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == numUser)
            {
                nVeces++;
            }
        }
        System.out.println("El nº "+numUser+" aparece "+nVeces+" veces.");
    }
}
