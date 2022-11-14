package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile7
{
    public static void main(String[] args)
    {
        int num;
        do
        {
            System.out.printf("Bienvenido a la aplicación del menú\n1. Opción1\n2. Opción2\n3. Opción3\n4. Opción4\n5. Salir\n");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            switch(num)
            {
                case 1:
                    System.out.println("La opción seleccionada es 1");
                    break;
                case 2:
                    System.out.println("La opción seleccionada es 2");
                    break;
                case 3:
                    System.out.println("La opción seleccionada es 3");
                    break;
                case 4:
                    System.out.println("La opción seleccionada es 4");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        }
        while(num != 5);
    }    
}
