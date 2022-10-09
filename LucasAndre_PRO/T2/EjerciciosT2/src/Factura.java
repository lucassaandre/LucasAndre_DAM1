import java.net.StandardSocketOptions;

public class Factura
{
    public static void main(String[] args)
    {
        FacturaMetodo();
    }
    public static void FacturaMetodo()
    {
        int     facturatotalConIVA = 2000;
        double  facturaIVA = (facturatotalConIVA * 21) / 100;
        double  facturaSinIVA = facturatotalConIVA - facturaIVA;
        System.out.println("Factura con IVA: " + facturatotalConIVA);
        System.out.println("Factura sin IVA: "+ facturaSinIVA);
        System.out.println("El IVA es: " + facturaIVA);
    }
}
