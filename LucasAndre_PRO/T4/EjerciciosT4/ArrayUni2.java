public class ArrayUni2
{
    public static void main(String[] args)
    {
        String[] temario = {"Tema 1: Introducción","Tema 2: Identificadores","Tema 3: Estructuras","Tema 4: Colecciones",
        "Tema 5: Orientación a objetos", "Tema 6: Clases y Objetos", "Tema 7; Abstracción, Herencia y Polimorfismo",
        "Tema 8: Ficheros y Excepciones", "Tema 9: Bases de datos", "Tema 10: Interfaces"};

        System.out.printf("SALIDA\n````\nNúmero de temas: %d\n", temario.length);
        for (String temas : temario)
        {
            System.out.println(temas);                
        }
        System.out.println("````");
    }    
}
