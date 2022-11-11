package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un entero para convertirlo a binario, octal y hexadecimal: ");
        int     numUser = input.nextInt();
        System.out.println("El número "+numUser+" en binario es: "+binary(numUser));
        System.out.println("El número "+numUser+" en octal es: "+octal(numUser));
        System.out.println("El número "+numUser+" en hexadecimal es: "+hexadecimal(numUser));
    }
    private static String binary(int num)
    {
        String output = "";
        int rest;

        while(num > 0)
        {
            rest = num % 2;
            num /= 2;
            output = rest + output;
        }
        return output;
    }
    private static String octal(int num)
    {
        String output = "";
        int rest;

        while(num > 0)
        {
            rest = num % 8;
            num /= 8;
            output = rest + output;
        }
        return output;
    }
    private static String hexadecimal(int num)
    {
        String output = "";
        String characters = "0123456789ABCDEF";
        int rest;

        while(num > 0)
        {
            rest = num % 16;
            num /= 16;
            output = characters.charAt(rest) + output;
        }
        return output;
    }
}
