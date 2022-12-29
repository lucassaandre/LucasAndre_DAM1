import java.util.Scanner;

public class ArrayUni10
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido a la lotería de Navidad.");
        int[] loteria = new int[7];
        for (int i = 0; i < loteria.length; i++)
        {
            loteria[i] = (int)(Math.random()*10);    
        }
        System.out.print("El número ganador de la lotería es ");
        for (int i : loteria)
        {
            System.out.print(i);    
        }
        System.out.println();
        int[] loteriaUser = new int[7];
        for (int i = 0; i < loteriaUser.length; i++)
        {
            do
            {
                System.out.println("Introduzca el "+(i+1)+"º número de su loteria de 7 cifras deseada: ");    
                loteriaUser[i] = new Scanner(System.in).nextInt();    
                if(loteriaUser[i] > 9)
                {
                    System.out.println("Número incorrecto, por favor introduzca un nº de una sola cifra.");
                }
                else if(loteriaUser[i] < 0)
                {
                    System.out.println("Número incorrecto, por favor introduzca un nº positivo.");
                }
            }
            while(loteriaUser[i] > 9 || loteriaUser[i] < 0);
        }
        System.out.print("El número introducido de su lotería es ");    
        for (int num : loteriaUser)
        {
            System.out.print(num);
        }
        System.out.println();
        System.out.println("Generando número de la lotería...");
        // int[] loteria = new int[7];
        // for (int i = 0; i < loteria.length; i++)
        // {
        //     loteria[i] = (int)(Math.random()*10);    
        // }
        boolean indicator = false;
        for (int i = 0, j = 0; i < loteria.length; i++, j=i)
        {
            if(loteria[i] == loteriaUser[j])
                {
                    indicator = true;
                }
                else
                {
                    indicator = false;
                    break;
                }
            }
        if(indicator == true)
        {
            System.out.println("¡ENHORABUENA, HAS GANADO LA LOTERÍA!");
        }
        else
        {
            System.out.println("Lo siento, tu número no ha sido el ganador.");
        }
        // System.out.print("El número ganador de la lotería es ");
        // for (int i : loteria)
        // {
        //     System.out.print(i);    
        // }
        // System.out.println();
    }    
}
