package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class DoWhile6
{
    public static void main(String[] args)
    {
        String replay;
        int record = 99999;
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Generando número aleatorio entre 0 - 20...");
            int numSystem = (int)(Math.random()*21);
            System.out.println("Número aleatorio generado.");
            System.out.println(numSystem);
            
            int attemps = 0;
            int numUser = 0;
            do
            {
                System.out.println("Adivina el número: ");
                numUser = input.nextInt();
                attemps++;
                if(numUser < 0 || numUser > 20)
                {
                    System.out.println("Número fuera de rango. Introduce un número entre 0 - 20");
                }
                else if(numUser != numSystem)
                {
                    System.out.println("Vaya no es el número, sigue intentándolo.");
                }
            }
            while(numUser != numSystem);
            System.out.println("Enhorabuena, has acertado el número en " + attemps + " intentos.");
            
            int ancientRecord;
            if(attemps < record)
            {
                ancientRecord = record;
                record = attemps;
                if(ancientRecord != 99999)
                {
                    System.out.println("¡También has superado el récord de antes! Tu anterior récord era de " + ancientRecord + " ¡Ahora lo has hecho en " + record + " intentos!");
                }
                if(record == 1)
                {
                    System.out.println("¡Récord máximo alcanzado! Ya no se registrarán más récords.");
                }
            }

            System.out.println("¿Quieres volver a jugar? (S/N)");
            replay = input.next();
            while(!(replay.equalsIgnoreCase("S")) && !(replay.equalsIgnoreCase("N")))
            {
                System.out.println("¡Letra no asignada a ninguna función!");
                System.out.println("¿Quieres volver a jugar? (S/N)");
                replay = input.next();
            }
            if(replay.equalsIgnoreCase("N"))
            {
                System.out.println("¡Hasta pronto!");
            }
        }
        while(replay.equalsIgnoreCase("S"));
    }
}
