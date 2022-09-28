public class EjercicioPráctico
{
    public static void saludo()
    {
        String nombre = "Lucas";
        String apellido = "Pinochet";
        int edad = 20;
        System.out.println("Hola eres "+nombre+" "+apellido+", tienes "+edad+" años y estás en clase de programación");
        System.out.print("Hola sin salto\n");
        System.out.print("\tOtra línea\n");
        System.out.printf("Hola eres %s %s y tienes %d años y estás en la clase de programación", nombre, apellido, edad);
    }

    public static void valoresMaxMin()
    {
        //Obtener los valores max y min de cada uno de los tipos
        //int float double short byte
        byte numeroByte = 9;
        short numeroShort = 9000;
        int numeroInt = 245453;
        long numeroLong = 234567;
        float numeroFloat;
        double numeroDouble;

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.printf("Byte\n");
        System.out.printf("Valor mín.:%d\n", minByte);
        System.out.printf("Valor máx.:%d\n\n", maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.printf("Short\n");
        System.out.printf("Valor mín.:%d\n", minShort);
        System.out.printf("Valor máx.:%d\n\n", maxShort);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.printf("Int\n");
        System.out.printf("Valor mín.:%d\n", minInt);
        System.out.printf("Valor máx.:%d\n\n", maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.printf("Long\n");
        System.out.printf("Valor mín.:%d\n", minLong);
        System.out.printf("Valor máx.:%d\n\n", maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.printf("Float\n");
        System.out.printf("Valor mín.:%f\n", minFloat);
        System.out.printf("Valor máx.:%f\n\n", maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.printf("Double\n");
        System.out.printf("Valor mín.:%f\n", minDouble);
        System.out.printf("Valor máx.:%f\n", maxDouble);

        System.out.printf("TIPO\t\tMIN\t\t\t\tMAX\n");
        System.out.printf("Integer\t\t%d\t\t%d\n", minInt, maxInt);
        System.out.printf("Double\t\t%f\t\t%f\n", minDouble, maxDouble);
        System.out.printf("Double\t\t%.2f\t\t\t%.2f\n", minDouble, maxDouble);
    }

    public static void main(String[] args)
    {
        //saludo();
        valoresMaxMin();
    }
}
