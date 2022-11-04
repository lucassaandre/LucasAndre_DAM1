package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class IfElse11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int     num1 = input.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int     num2 = input.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int     num3 = input.nextInt();
        System.out.printf("Introduzca una de las dos opciones:\ntrue - para "
        + "orden ascendente\nfalse - para orden descendente\n");
        boolean ascDes = input.nextBoolean();
        orderNum(num1, num2, num3, ascDes);
    }
    private static void orderNum(int num1, int num2, int num3, boolean ascDes)
    {
        if(ascDes == true)
        {
            if(OneTwoThree(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num3, num2, num1);
            }
            else if(OneThreeTwo(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num2, num3, num1);
            }
            else if(TwoOneThree(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num3, num1, num2);
            }
            else if(TwoThreeOne(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num1, num3, num2);
            }
            else if(ThreeOneTwo(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num2, num1, num3);
            }
            else if(ThreeTwoOne(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num1, num2, num3);
            }
            else
            {
                System.out.println("Algo ha ido mal (T)");
            }
        }
        else
        {
            if(OneTwoThree(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num1, num2, num3);
            }
            else if(OneThreeTwo(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num1, num3, num2);
            }
            else if(TwoOneThree(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num2, num1, num3);
            }
            else if(TwoThreeOne(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num2, num3, num1);
            }
            else if(ThreeOneTwo(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num3, num1, num2);
            }
            else if(ThreeTwoOne(num1, num2, num3))
            {
                System.out.printf("%d, %d, %d", num3, num2, num1);
            }
            else
            {
                System.out.println("Algo ha ido mal (F)");
            }
        }
    }
    private static boolean OneTwoThree(int num1, int num2, int num3)
    {
        return num1 > num2 && num1 > num3 && num2 > num3;
    }
    private static boolean OneThreeTwo(int num1, int num2, int num3)
    {
        return num1 > num2 && num1 > num3 && num3 > num2;
    }
    private static boolean TwoOneThree(int num1, int num2, int num3)
    {
        return num2 > num1 && num2 > num3 && num1 > num3;
    }
    private static boolean TwoThreeOne(int num1, int num2, int num3)
    {
        return num2 > num1 && num2 > num3 && num3 > num1;
    }
    private static boolean ThreeOneTwo(int num1, int num2, int num3)
    {
        return num3 > num1 && num3 > num2 && num1 > num2;
    }
    private static boolean ThreeTwoOne(int num1, int num2, int num3)
    {
        return num3 > num1 && num3 > num2 && num2 > num1;
    }
}
