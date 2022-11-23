import java.util.Scanner;

public class EjercicioUno
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la palabra maestra :");
        String pMaestra = input.nextLine();
        String pSecundaria = input.nextLine();
        do
        {
        System.out.println("Introduzca la palabra secundaria :");
        pSecundaria = input.nextLine();
        if(pMaestra.equals(pSecundaria))
        {
            for (int i = 0; i < pSecundaria.length(); i++){

            }
        }
        else if(pMaestra.contentEquals(pSecundaria))
        {
            System.out.println(pSecundaria.length());;
        }
        }
        while(!pMaestra.equals(pSecundaria));
    }
}
