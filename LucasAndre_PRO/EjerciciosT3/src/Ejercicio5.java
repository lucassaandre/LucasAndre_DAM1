import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce nº");
        int     numeroLeido = input.nextInt();

        if (numeroLeido > 999 && numeroLeido < 10000)
        {
            //foto Eric
            int n1 = numeroLeido / 1000;
            int n2 = numeroLeido % 1000;
            int n3 = numeroLeido % 100;
            int n4 = numeroLeido % 10;

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
        }
    }
}
