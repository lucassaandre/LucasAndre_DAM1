import java.util.Scanner;

public class EjercicioDos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String  participante1 = input.next();
        System.out.println("Introduce el nº de jugadores: ");
        int     njugadores1 = input.nextInt();
        System.out.println("Introduce tu presupuesto: ");
        int     presupuesto1 = input.nextInt();

        boolean is111 = njugadores1 == 11;
        boolean isPar1 = njugadores1 % 2 == 0;
        boolean isPositive1 = presupuesto1 >= 0;

        System.out.println("Introduce tu nombre: ");
        String  participante2 = input.next();
        System.out.println("Introduce el nº de jugadores: ");
        int     njugadores2 = input.nextInt();
        System.out.println("Introduce tu presupuesto: ");
        int     presupuesto2 = input.nextInt();

        boolean is112 = njugadores2 == 11;
        boolean isPar2 = njugadores2 % 2 == 0;
        boolean isPositive2 = presupuesto2 >= 0;

        System.out.println("Introduce tu nombre: ");
        String  participante3 = input.next();
        System.out.println("Introduce el nº de jugadores: ");
        int     njugadores3 = input.nextInt();
        System.out.println("Introduce tu presupuesto: ");
        int     presupuesto3 = input.nextInt();

        boolean is113 = njugadores3 == 11;
        boolean isPar3 = njugadores3 % 2 == 0;
        boolean isPositive3 = presupuesto3 >= 0;

        boolean isReady = (is111 && is112 && is113) && (isPositive1 && isPositive2
                && isPositive3);
        System.out.printf("El primer participante tiene 11 jugadores: %b\nEl segundo participante " +
                "tiene jugadores pares: %b\nEl tercer participante tiene presupuesto positivo: %b\nLa liga " +
                "está preparada para empezar: %b\n", is111, isPar2, isPositive3, isReady);
    }
}
