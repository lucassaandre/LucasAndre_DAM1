import java.util.Scanner;

/*1. Crea un array de 10 números con los valores que quieras
     Sacar el sumatorio de todos los numeros
     Sacar la media de los numeros
     Sacar el numero más grande
     Sacar el número más pequeño
  2. Crear un array con las letras del abc y las rellenais
     Sacar 5 palabras aleatorias de 5 letras
     palabra1 = HJBGC (las letras son las del abc que hemos creado)
  3. Crear una app que me pida cuantos números quiero introducir
     "Cuántos num quieres introducir?" = 3
     "Introduce el 1er num" = 9
     "Introduce el 2er num" = 5
     "Introduce el 3er num" = 3
     Introducir el num de numeros dichos y guardarlos en un array
     Sacar por consola todos los num introducidos
     9, 5, 3
  4. Realiza una aplicacion que simule el funcionamiento de la primitiva
     - La primitiva es unjuego donde el usuario dice cuales son los 5 numeros
     con los que juega [5,34,78,65,86] --> los numeros estan 0-99. En el caso
     de introducir un numero no en rango el sistema pedirá otro [1,6,90,76,98]
     Una vez metidos todos los números el sistema muestra el cupon
     1: 5
     2: 34
     3: 78
     4: 65
     5: 86
     El sistema genera 5 numeros premiados[6,67,23,65,5]
     El sistema evalua cual es el premio que me ha tocado: hay que comparar el primer metido con todos los demás,
     el segundo metido, con todos los demás, etc hasta 5 veces.
     - 0 acuertos: 0
     - 1 acierto:  10
     - 2 aciertos: 100
     - 3 aciertos: 1000
     - 4 aciertos: 10000
     - 5 aciertos: 100000
 */
public class T4_Arrays
{
    public static void main(String[] args)
    {
        //ejercicioUnoArrays();
        //ejercicioDosArrays();
        //ejercicioTresArrays();
        //ejercicioCuatroArrays();
    }
    private static void ejercicioUnoArrays()
    {
        int[] numbers = new int[] {40, 51, 27, 63, 74, 85, 36, 17, 18, 49};

        int sumatorio = 0;
        int max= -9999; int min = 9999;
        for (int i = 0; i < numbers.length; i++)
        {
            sumatorio += numbers[i];
        }
    }
    private static void ejercicioDosArrays()
    {
        String[] letters = new String[] {"A", "B", "C", "D", "E"};
    }
    private static void ejercicioTresArrays()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres introducir?");
        int[] cantidadNumeros = new int[input.nextInt()];
        System.out.println("Introduce el primer número: ");
        int[] primerNum = {input.nextInt()};
        System.out.println("Introduce el segundo número: ");
        int[] primerNum = {input.nextInt()};
        System.out.println("Introduce el tercer número: ");
        int[] primerNum = {input.nextInt()};
    }
    private static void ejercicioCuatroArrays()
    {
        Scanner input = new Scanner(System.in);
        int[]   cuponUsuario = new int[5];
        int[]   cuponSistema = new int[5];
    }
}
