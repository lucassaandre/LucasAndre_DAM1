public class Entrada {

    public String miNombreClase = "Lucas Clase";


    //método para ver características de ámbitos
    /*Varias
    líneas*/


    public void metodoInicial(){
        //tipo_acceso tipo_de_la_variable nombre_de_variable = valor_variable
        //String guarda palabras ""
        String nombre = "Lucas";
        System.out.println(nombre);
    }
    //TODO crear x

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    //ámbito de bloque o método(función)
    {
        String miNombre = "Lucas";
        miNombre = "LucasP";
        miNombre = "LucasPB";
        System.out.println("Hola Mundo");
    }

}
