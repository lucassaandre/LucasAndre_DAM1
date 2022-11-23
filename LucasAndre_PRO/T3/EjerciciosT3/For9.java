package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For9
{
    public static void main(String[] args) 
    {
        System.out.println("Este programa pide 10 números. Muestra la media de los números positivos, la media de los números negativos y la cantidad de ceros.");
        Scanner input = new Scanner(System.in);

        int num;
        double positives = 0;
        double negatives = 0;
        int qPositives = 0;
        int qNegatives = 0;
        int qCeros = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Introduce el "+i+"º número: ");
            num = input.nextInt();
            if(num > 0)
            {
                positives += num;
                qPositives++;
            }
            else if(num == 0)
            {
                qCeros++;
            }
            else
            {
                negatives += num;
                qNegatives++;
            }
        }
        System.out.printf("La media de los números positivos introducidos es de %.2f\n",positives/qPositives);
        System.out.printf("La media de los números negativos introducidos es de %.2f\n",negatives/qNegatives);
        System.out.println("La cantidad de ceros introducidos es de "+qCeros);
    }
}
