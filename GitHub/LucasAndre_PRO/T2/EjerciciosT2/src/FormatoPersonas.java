import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class FormatoPersonas
{
    public static void main(String[] args)
    {
        String linea1 = pedirDatos();
        String linea2 = pedirDatos();
        System.out.println("NOMBRE\t\t\t\tEDAD\t\tALTURA\t\tCARNET\t\tLETRA");
        System.out.println("==========\t\t===== ====== ====== =====");
        System.out.println(linea1);
        System.out.println(linea2);
    }
    public static String pedirDatos()
    {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String  nombreLeido = lecturaTeclado.next();
        System.out.println("Introduzca su apellido: ");
        String  apellidoLeido = lecturaTeclado.next();
        System.out.println("Introduzca su edad: ");
        int     edadLeida = lecturaTeclado.nextInt();
        System.out.println("Introduzca su altura en m: ");
        float   alturaLeida = lecturaTeclado.nextFloat();
        System.out.println("¿Tienes carnet de conducir?");
        boolean carnetLeido = lecturaTeclado.nextBoolean();
        System.out.println("Introduzca la letra de su DNI: ");
        char  letraLeida = lecturaTeclado.next().charAt(0);

        return String.format(nombreLeido + " " + apellidoLeido + "\t\t\t\t" + edadLeida + "\t\t\t" + alturaLeida + "\t\t" + carnetLeido + "\t\t" + letraLeida);
    }
}
