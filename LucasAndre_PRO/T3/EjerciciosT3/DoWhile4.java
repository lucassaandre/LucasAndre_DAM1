import java.util.Scanner;

public class DoWhile4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un entero para convertirlo a binario, octal y hexadecimal: ");
        int     numUser = input.nextInt();
        System.out.println(binary(numUser));
    }
    private static int binary(int num)
    {
        int result = num % 2;
        if(result == 1)
        {
            return 1;
            binary(num);
        } 
        else if(result == 0)
        {
            return 0;
        }
        else
        {
            return 2;
        }
    }
}
