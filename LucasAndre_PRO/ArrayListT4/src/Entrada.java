import java.util.ArrayList;
import java.util.Scanner;

public class Entrada
{
    public static void main(String[] args)
    {
        //inicioArrayList();
        //listasTipadas();
        ejercicioNumeros();
    }

    private static void ejercicioNumeros()
    {
        //Crear una lista de nº (solo nº)
        //Meter 50 aleatorios entre 0 - 20
        //Pedir usuario nº
            //Indicar las veces que se repite
            //Obtener primero la posicion del numero indicado la primera vez que se repite
        //En el caso de no repetirse nunca, avisar al user
        //En el caso de no estar, avisar al user

        ArrayList<Integer> miLista = new ArrayList(50);
        for (int i = 0; i < 50; i++)
        {
            miLista.add(i, (int)(Math.random() * 20));
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce nº: ");
        int numUser = input.nextInt();
        int repeats = 0;
        for (int num: miLista)
        {
            if(numUser == num)
            {
                repeats++;
            }
        }
        System.out.println("Se ha repetido: "+repeats+" veces.");
    }

    public static  void inicioArrayList()
    {
        ArrayList lista = new ArrayList();
        //tamaño lista
        System.out.println(lista.size());
        //añadir elemento
        lista.add("Elemento 1");
        lista.add(12345);
        lista.add(true);
        lista.add('A');
        System.out.println(lista.size());
        //eliminar elementos
        lista.remove(2);
        lista.remove(1);
        System.out.println(lista.size());
        //antes del cambio
        System.out.println("El elemento de la pos. 1 es "+lista.get(0));
        //cambio elemento
        lista.set(0, 9876);
        System.out.println(lista.size());
        System.out.println("El elemento de la pos. 1 es "+lista.get(0));
        //sacar todos los elementos de la lista
        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i));
        }
        for (Object item: lista)
        {
            System.out.println(item);
        }
    }
    public static void listasTipadas()
    {
        ArrayList<String> listaPalabras = new ArrayList();
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Palabra 2");
        listaPalabras.add("Palabra 3");
        listaPalabras.add("Palabra 4");
        listaPalabras.add("Palabra 5");
        listaPalabras.add("Palabra 6");

        //buscar elementos
        // --> se pide una palabra por teclado
        // --> se comprueba si la palabra esta en la lista
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce palabra: ");
        String palabra = input.nextLine();
        boolean exist = false;
        for (String item: listaPalabras)
        {
            if(palabra.equals(item))
            {
                exist = true;
                break;
            }
        }
        System.out.println(exist);
    }
}
