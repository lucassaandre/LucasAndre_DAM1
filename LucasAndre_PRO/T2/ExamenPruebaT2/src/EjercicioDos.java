import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EjercicioDos
{
    public static void main(String[] args)
    {
        final int   IVA = 21;

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce el precio de la PlayStation 5: ");
        double      articuloUno = lecturaTeclado.nextDouble();
        System.out.println("Introduce el precio del iPhone12: ");
        double      articuloDos = lecturaTeclado.nextDouble();
        System.out.println("Introduce tu nombre: ");
        String      nombre = lecturaTeclado.next();
        System.out.println("Introduce la cantidad de ahorro disponible: ");
        double      ahorro = lecturaTeclado.nextDouble();

        System.out.println("Artículo PlayStation 5: " + articuloUno);
        System.out.println("Artículo iPhone 12: " + articuloDos);
        System.out.println("IVA aplicado: " + IVA + "%");
        System.out.println("Total de la factura con IVA: " + (articuloUno + articuloDos));
        System.out.println("Total de la factura sin IVA: " + ((articuloUno + articuloDos) - ((articuloUno + articuloDos)*IVA)/100));
        System.out.println("Ahorros disponibles: " + ahorro);

        boolean dosArticulos = articuloUno + articuloDos < ahorro;
        boolean unArticulo = articuloUno < ahorro || articuloDos < ahorro;
        System.out.println("¿Puedo comprar los dos artículos?: " + dosArticulos);
        System.out.println("¿Puedo comprar uno de los dos artículos?: " + unArticulo);


    }
}
