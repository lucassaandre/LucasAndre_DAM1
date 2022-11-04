package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;
import java.util.Scanner;

public class IfElse5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número natural de cuatro dígitos: ");
        int     num = input.nextInt();

        if(num >= 1000 && num <= 9999)
        {
            if((num / 1000 == num % 10) && ((num % 1000) / 100 == (num % 100) / 10))
            {
                System.out.println("Es capicúa");
            }
            else
            {
                System.out.println("No es capicúa");
            }
        }
        else
        {
            System.out.println("El número no tiene 4 dígitos");
        }
    }    
}
