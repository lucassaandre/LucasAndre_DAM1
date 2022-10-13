import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el precio del coche: ");
        int     precioCoche = input.nextInt();
        System.out.println("¿En cuántos plazos lo vas a pagar?");
        int     plazos = input.nextInt();
        int     cuotas = precioCoche / plazos;
        System.out.println("Vas a pagar el coche de " + precioCoche + "€ en "
        + plazos + " meses, con un total de " + cuotas + "€ cada plazo (sin" +
                " tener en cuenta los intereses)");
    }
}
