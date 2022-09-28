public class EntradaVariable
{
    public static void main(String[] args)
    {
        System.out.println("Tipos de variable");

        //palabras -> String siempre ""
        //si no tiene valor asignado es null
        //variable compleja = si no tiene valor asignado es null
        String nombre = "Lucas";
        String apellido = "Pinochet";

        //letra -> char (se ponen entre '')
        //si no tiene valor es -1
        //variable primitiva
        char grupoSang = 'A';

        //números enteros -> int
        //byte, short
        //si no le doy valor = 0
        //variable primitiva = si no le doy valor = 0
        int edad = 20;

        //números con decimales o grandes -> double y float respectivamente
        //si no le doy valor = 0.0
        //variable primitiva = si no le doy valor = 0
        double peso = 55.5;
        float peso2 = 55.5f;

        //verdadero o falso -> true false
        //bolean si no le doy valor será false
        //variable primitiva
        boolean aprobado = true;

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(grupoSang);
        System.out.println(edad);
        System.out.println(peso);
        System.out.println(peso2);
        System.out.println(aprobado);

    }

    /*Crear un método que se llame saludar y crear variables que guarden con vuestro
    nombre, apellido, edad y salga por consola el saludo:
     "HOLA BORJA MARTIN, TIENES 38 AÑOS Y ESTÁS EN LA CLASE DE PROGRAMACIÓN*/
}
