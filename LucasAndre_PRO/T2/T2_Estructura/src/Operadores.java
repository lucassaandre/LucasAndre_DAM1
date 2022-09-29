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
        resultado = numeroUno == numeroDos;
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

    }

    public static void main(String[] args)
    {
        //operadoresAritmeticos();
        //operadoresAsignación();
        //operadoresRelacionales();
        operadoresLogicos();
    }
}