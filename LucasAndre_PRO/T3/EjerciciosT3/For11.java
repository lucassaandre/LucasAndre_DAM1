package LucasAndre_DAM1.LucasAndre_PRO.T3.EjerciciosT3;

import java.util.Scanner;

public class For11
{
    public static void main(String[] args)
    {
        System.out.println("Este programa pide 6 notas y escribe la cantidad de alumnos aprobados, condicionados (= 4) y suspensos.");
        Scanner input = new Scanner(System.in);

        int grade;
        int pass = 0;
        int conditioned = 0;
        int failed = 0;
        for (int i = 1; i <= 6; i++)
        {
            do
            {
                System.out.println("Escribe la "+i+"º nota: ");
                grade = input.nextInt();
                if(grade < 0 || grade > 10)
                {
                    System.out.println("Nota fuera de rango. Nº válidos para notas entre el rango de 0 - 10.");
                }
            }
            while(grade < 0 || grade > 10);
            if(grade >= 5)
            {
                pass++;
            }
            else if(grade == 4)
            {
                conditioned++;
            }
            else
            {
                failed++;
            }
        }
        System.out.println("Alumnos aprobados: "+pass);
        System.out.println("Alumnos condicionados: "+conditioned);
        System.out.println("Alumnos suspensos: "+failed);
    }    
}
