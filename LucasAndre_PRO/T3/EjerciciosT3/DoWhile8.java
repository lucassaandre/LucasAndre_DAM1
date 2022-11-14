package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile8
{
    public static void main(String[] args)
    {
        int numOption;
        do
        {
            System.out.println("Bienvenido a la aplicación de calculos");
            Scanner input = new Scanner(System.in);
            do
            {
                System.out.printf("Selecciona la operacion que quieres realizar:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Módulo\n6. Salir\n");
                numOption = input.nextInt();
                if(numOption < 1 || numOption > 6)
                {
                    System.out.println("El número no corresponde a ninguna de las opciones establecidas.");
                }
            }
            while(numOption < 1 || numOption > 6);
            if(numOption == 6)
            {
                break;
            }

            System.out.println("Introduce operando uno: ");
            int     num1 = input.nextInt();
            System.out.println("Introduce operando dos: ");
            int     num2 = input.nextInt();

            switch(numOption)
            {
                case 1:
                    System.out.println("El resultado de la operación es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("El resultado de la operación es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El resultado de la operación es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("El resultado de la operación es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("El resultado de la operación es: " + (num1%num2));
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        }
        while(numOption != 6);
    }    
}
