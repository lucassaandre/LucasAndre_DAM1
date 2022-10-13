import java.util.Scanner;

public class EjercicioUno
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String  nombre = input.nextLine();
        System.out.println("Introduce tu apellido: ");
        String  apelllido = input.nextLine();
        System.out.println("Introduce tu edad: ");
        int     edad = input.nextInt();
        System.out.println("Introduce tu altura: ");
        double  altura = input.nextDouble();
        System.out.println("Introduce tu peso: ");
        double  peso = input.nextDouble();
        System.out.println("Introduce tu sexo: ");
        char    sexo = input.next().charAt(0);
        double     IMC = calculoIMC(peso, altura);

        System.out.printf("Hola %s tu IMC teniendo en cuenta tu altura de %.1fcm y tu peso de " +
                "%.1fkg, tiene un valor de %.2f\n", nombre, altura, peso, IMC);
    }
    public static double calculoIMC(double kg, double m)
    {
        return kg / Math.pow(m / 100, 2);
    }
}
