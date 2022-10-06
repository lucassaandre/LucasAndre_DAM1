import java.util.Scanner;

public class Bar
{
    public static void main(String[] args)
    {
        precios();
    }
    public static void precios()
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuántas bebidas van a tomar?");
        int     bebidas = lectura.nextInt();
        System.out.println("¿Cuántos bocadillos van a comer?");
        int     bocadillos = lectura.nextInt();

        double  costeBebidas = bebidas * 1.25;
        double  costeBocadillos = bocadillos * 2.05;
        double  costeTotal = costeBebidas + costeBocadillos;

        System.out.println("Coste de las bebidas: " + costeBebidas);
        System.out.println("Coste de los bocadillos: " + costeBocadillos);
        System.out.println("Coste consumición: " + costeTotal);
    }
}
