public class EjercicioCuatro
{
    public static void main(String[] args)
    {
        String frase = "En este ejercicio vamos a evaluar la cantidad de elementos de una " +
               "frase, separando por oraciones. Esto es otro elemento sobre el que " +
               "evaluar el resultado";

        //String frase = "Hola, Lucas, hola Ale. jandro.";

        //numero palabras
        int palabras = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == ' ')
            {
                palabras++;
            }
        }
        palabras++;
        System.out.println("El número de palabras es de "+palabras);

        //numero letras
        int letras = frase.length();
        //System.out.println("El número de letras antes es de "+letras);
        for (int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == ' ' || frase.charAt(i) == ',' || frase.charAt(i) == '.')
            {
                letras--;
            }
        }
        System.out.println("El número de letras es de "+letras);

        //numero de frases
        int frases = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == ',' || frase.charAt(i) == '.')
            {
                frases++;
            }
        }
        frases++;
        System.out.println("El número de frases es de "+frases);

        //numero de oraciones
        int oraciones = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == '.')
            {
                oraciones++;
            }
        }
        oraciones++;
        System.out.println("El número de oraciones es de "+oraciones);
    }
}
