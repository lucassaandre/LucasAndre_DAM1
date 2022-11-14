package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String letterUser;
        int numUser;
        do
        {
            System.out.println("Bienvenido a la aplicación de cambios de base.");
            do
            {
                System.out.println("Selecciona la base a la que quieres pasar: ");
                System.out.printf("A. Pasar a Base2\nB. Pasar a Base8\nC. Pasar a Base16\nF. Salir\n");
                letterUser = input.next();
                if(!letterUser.equalsIgnoreCase("A") && !letterUser.equalsIgnoreCase("B") && !letterUser.equalsIgnoreCase("C") && !letterUser.equalsIgnoreCase("F"))
                {
                    System.out.println("La letra no corresponde a ninguna de las opciones");
                }
            }
            while(!letterUser.equalsIgnoreCase("A") && !letterUser.equalsIgnoreCase("B") && !letterUser.equalsIgnoreCase("C") && !letterUser.equalsIgnoreCase("F"));
            if(letterUser.equalsIgnoreCase("F"))
            {
                break;
            }
            do
            {
                System.out.println("Introduce el número que quieres cambiar de base:");
                numUser = input.nextInt();
                if(numUser < 0)
                {
                    System.out.println("Número no válido, asegurate de que tu número es mayor que 0");
                }
            }
            while(numUser < 0);

            int rest;
            String biOcHex = "";
            int ancientNumUser;
            switch(letterUser)
            {
                case "A", "a":
                    ancientNumUser = numUser;
                    while(numUser > 0)
                    {
                        rest = numUser % 2;
                        numUser /= 2;
                        biOcHex = rest + biOcHex;
                    }
                    System.out.println("El número " +ancientNumUser+ " en Base10 es igual que "+biOcHex+" en Base2");
                    break;
                case "B", "b":
                    ancientNumUser = numUser;
                    while(numUser > 0)
                    {
                        rest = numUser % 8;
                        numUser /= 8;
                        biOcHex = rest + biOcHex;
                    }
                    System.out.println("El número " +ancientNumUser+ " en Base10 es igual que "+biOcHex+" en Base8");
                    break;
                case "C", "c":
                    String characters = "0123456789ABCDEF";
                    ancientNumUser = numUser;
                    while(numUser > 0)
                    {
                        rest = numUser % 16;
                        numUser /= 16;
                        biOcHex = characters.charAt(rest) + biOcHex;
                    }
                    System.out.println("El número " +ancientNumUser+ " en Base10 es igual que "+biOcHex+" en Base16");
            }

        }
        while(!letterUser.equalsIgnoreCase("F"));
    }    
}
