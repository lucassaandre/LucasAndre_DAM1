public class EjercicioDos
{
    public static void main(String[] args)
    {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        //array numero
        for (int i = 0; i < numero.length; i++)
        {
            numero[i] = (int)(Math.random()*101);
        }
        System.out.println("Array numero: ");
        for (int item: numero)
        {
            System.out.print(item+", ");
        }
        System.out.println();

        //array cuadrado
        for (int i = 0; i < cuadrado.length; i++)
        {
            cuadrado[i] = (int)Math.pow(numero[i], 2);
        }
        System.out.println("Array cuadrado: ");
        for (int item: cuadrado)
        {
            System.out.print(item+", ");
        }
        System.out.println();

        //array cubo
        for (int i = 0; i < cubo.length; i++)
        {
            cubo[i] = (int)(Math.pow(numero[i], 3));
        }
        System.out.println("Array cubo: ");
        for (int item: cubo)
        {
            System.out.print(item+", ");
        }
        System.out.println();
    }
}
