import java.util.Scanner;

public class EjercicioUno
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce cuántos números de Fibonacci quieres que salgan: ");
        int     numUser = input.nextInt();

        int     fibonacciPrimero = 1;
        int     fibonacciSegundo = 1;
        System.out.print("0, ");
        for (int i = 2; i <= numUser; i++)
        {
            System.out.print(fibonacciSegundo+" ,");
            fibonacciPrimero = fibonacciSegundo - fibonacciPrimero;
            fibonacciSegundo = fibonacciPrimero + fibonacciSegundo;
        }
    }
}
