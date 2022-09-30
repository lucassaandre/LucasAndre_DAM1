import java.sql.SQLOutput;
import java.util.Scanner;

public class Operadores
{
    public static void operadoresAritmeticos()
    {
        int numeroUno;

        numeroUno = 0;
        numeroUno++;
        numeroUno++;
        numeroUno++;
        numeroUno++;
        System.out.printf("El valor del número es %d\n", numeroUno);


        int n1 = 5;
        int n2 = 10;
        int suma = n1 + n2;

        System.out.printf("La suma entre %d y %d es %d\n", n1, n2, suma);

        int multi;

        multi = n1 * n2;
        System.out.printf("La multiplicación es %d\n", multi);

        //float   div;

        //div = (float) n1 / (float) n2;
        System.out.printf("La división es %.2f", (float) n1 / (float) n2);
    }

    public static void operadoresAsignación()
    {
        int numeroUno = 10, numeroDos = 20;

        //+=
        numeroUno += numeroDos;
        System.out.printf("El valor de n1 es %d\n", numeroUno);
        //-=
        numeroUno -= 6;
        System.out.printf("El valor de n1 es %d\n", numeroUno);
        //*=
        numeroUno *= 2;
        System.out.printf("El valor de n1 es %d\n", numeroUno);
        ///=
        numeroUno /= 24;
        System.out.printf("El valor de n1 es %d\n", numeroUno);
        //%=
        numeroUno %= 3;
        System.out.printf("El valor de n1 es %d\n", numeroUno);


    }

    public static void operadoresRelacionales()
    {
        //relacionales o de comparación --> true/false
        int numeroUno = 10, numeroDos = 9;
        boolean resultado; //false by default

        resultado = numeroUno > numeroDos;
        System.out.printf("El resultado de comparar (>) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        resultado = numeroUno >= numeroDos;
        System.out.printf("El resultado de comparar (>) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);

        numeroUno = 19;
        numeroDos = 10;
        resultado = numeroUno <= numeroDos;
        System.out.printf("El resultado de comparar (<) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);

        numeroUno = 9;
        numeroDos = 10;
        resultado = numeroUno == numeroDos; // ===
        System.out.printf("El resultado de comparar (==) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        resultado = numeroUno != numeroDos;
        System.out.printf("El resultado de comparar (!=) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 16;
        resultado = !(numeroUno < numeroDos);
        System.out.printf("El resultado de comparar (!) %d con el %d, es %b\n", numeroUno, numeroDos, resultado);


    }

    public static void operadoresLogicos()
    {
        //&& --> cuando es verdadera: cuando todas son verdaderas, sino false
        //|| -->

        int numeroUno = 10, numeroDos = 6, numeroTres = 3;
        boolean acierto = false, resultado;
        String nombre; //Se inicializan a null (todos los valores NO primitivos, se inicializan así);

        resultado = (numeroDos < 6) || (numeroTres != numeroUno) || (numeroUno > 10);
        //System.out.println("%s", resultado);
        resultado = (numeroDos < 6) || (numeroTres != numeroUno) || (numeroUno > 10);
    }

    //mod_acceso (public, protected, private)
    //static acceder de forma directa
    //void retorno vacío: solo ejecuta lo que está dentro definido
    //int, double, String, (cualquier tipo) retorno: se ejecuta y me devuelve lo que ha ejecutado
    //Si tiene retorno, la última palabra del método es return

    //public static void metodoSinRetorno ();
    public static int metodoConRetorno()
    {
        return 10;
    }

    public static int suma(int n1, int n2)
    {
        return n1 + n2;
    }

    public static int resta(int n1, int n2)
    {
        return n1 - n2;
    }

    public static int multi(int n1, int n2)
    {
        int result = n1 * n2;

        return result;
    }

    public static int div(int n1, int n2)
    {
        return n1 / n2;
    }

    public static int mod(int n1, int n2)
    {
        int result = n1 % n2;

        return result;
    }

    public static void metodoSinParametros()
    {}

    public static void metodoConParametros(String nombre, int numero)
    {
        System.out.printf("El nombre es %s\n", nombre);
        System.out.printf("El numero es %d\n", numero);
    }

    //Scanner --> complejo --> muchas funcionalidades
    //Sintaxis variable compleja:
    //Tipo nombre =  new Tipo()


    ///Realizar las operaciones matematicas, donde se pida por teclado las
    /// operaciones que necesito en cada operacion (modificar los ya creados)
    ///Indica el primer parametro: , indica el segundo:
    ///Usar return

    ///METODO saludar() //nombre, apellido, edad
    ///Introduce tu nombre
    ///Introduce tu apellido
    ///Introduce tu edad
    ///Bienvenido a la clase de programacion, los datos pasados son
    ///nombre: XXX
    ///apellido: XXX
    ///edad: XXX
    public static void main(String[] args)
    {
        //operadoresAritmeticos();
        //operadoresAsignación();
        //operadoresRelacionales();
        //operadoresLogicos();
        //System.out.println(metodoConRetorno());
        System.out.printf("El resultado de la suma es %d\n", suma(5, 20));
        System.out.printf("El resultado de la resta es %d\n", resta(10, 5));
        System.out.printf("El resultado de la multiplicación es %d\n", multi(5, 5));
        System.out.printf("El resultado de la división es %d\n", div(10, 5));
        System.out.printf("El resultado del módulo es %d\n", mod(50, 10));
        //metodoConParametros("Lucas", 31);

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Por favor introduce el número que quieres leer:");
        int numeroLeido = lecturaTeclado.nextInt();
        System.out.println("El número leído es: "+numeroLeido);


    }
}