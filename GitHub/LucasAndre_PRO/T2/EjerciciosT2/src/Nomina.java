import java.util.Scanner;

public class Nomina
{
    public static void main(String[] args)
    {
        NominaMetodo();
    }
    public static void NominaMetodo()
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor introduce tu sueldo bruto:");
        int numeroLeido = lectura.nextInt();
        System.out.println("Por favor introduce el nº de pagas:");
        int numeroLeido2 = lectura.nextInt();

        double salarioNeto = numeroLeido - (numeroLeido * 15) / 100;
        double salarioBrutoMensual = numeroLeido / numeroLeido2;
        double salarioNetoMensual = salarioNeto / numeroLeido2;

        System.out.println("Tu salario bruto anual es: " + numeroLeido);
        System.out.println("Tu salario bruto mensual es: " + salarioBrutoMensual);
        System.out.println("Tu salario neto anual es: " + salarioNeto);
        System.out.println("Tu salario neto mensual es: " + salarioNetoMensual);
    }
}
//Clases: la primera letra mayus
//Constantes: Todas en MAYUS
//Variables: la primera palabra minus, la segunda letra mayus el resto de la palabra en minus
//Métodos: camel case