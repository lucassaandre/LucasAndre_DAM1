package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

public class DoWhile3
{
    public static void main(String[] args)
    {
        int num;
        int max = 0;
        do
        {
            System.out.println(num = (int)(Math.random()*101));
            if(num > max)
            {
                max = num;
            }
        }
        while(num != 0);
        System.out.println("El número mayor generado es: " + max);
    }  
}
