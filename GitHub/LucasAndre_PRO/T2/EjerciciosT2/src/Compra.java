import java.util.Scanner;

public class Compra
{
    public static void main(String[] args)
    {
    }
    public static void compra()
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el valor de su compra con IVA: ");
        int     compra = lectura.nextInt();
        System.out.println("Introduzca el % valor del IVA aplicado: ");
        int     iva = lectura.nextInt();

        double  ivaCompra = (compra * iva) / 100;
        double  compraSinIva = ;

    }
}
