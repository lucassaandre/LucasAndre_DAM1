public class ArrayUni7
{
    public static void main(String[] args)
    {
        int[] arrayTen = new int[10];
        for (int i = 0; i < arrayTen.length; i++)
        {
            arrayTen[i] = (int)(Math.random()*10);
            System.out.printf("%d, ", arrayTen[i]);    
        }
        System.out.println();
        System.out.println("Incremento en 1 los valores pares y en -1 los impares: ");
        for (int i = 0; i < arrayTen.length; i++)
        {
            if(arrayTen[i] % 2 == 0)
            {
                arrayTen[i] += 1;
            }
            else
            {
                arrayTen[i] -= 1;
            }
            System.out.printf("%d, ", arrayTen[i]); 
        }
        System.out.println();
        System.out.println("Duplicado de los valores positivos menores que 5: ");
        for (int i = 0; i < arrayTen.length; i++)
        {
            if(arrayTen[i] < 5)
            {
                arrayTen[i] *= 2;
            }
            System.out.printf("%d, ", arrayTen[i]);
        }
        System.out.println();
        System.out.println("Suma a cada valor un valor entero aleatorio entre -5 y 5: ");
        int random = 0;
        for (int i = 0; i < arrayTen.length; i++)
        {
            random = (int)(Math.random()*(6 - (-6)) + (-6));
            arrayTen[i] += random;
            System.out.printf("%d, ", arrayTen[i]);
            //Guardo en otra variable e imprimo el nº random con el símbolo "+" delante para comprobar que la suma es correcta
            //System.out.printf("+%d, ", random);
        }
        System.out.println();
        System.out.println("Desplazado del array una posición hacia la derecha: ");
        int ultimo = arrayTen[arrayTen.length - 1];
        for (int i = arrayTen.length - 1; i >= 1; i--)
        {
            arrayTen[i] = arrayTen[i - 1];
        }
        arrayTen[0] = ultimo;
        for (int i : arrayTen)
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
        System.out.println("Intercambio del primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último: ");
        int aux;
        for (int i = 0; i < arrayTen.length - 1; i+=2)
        {
            //if(i % 2 == 0)
            //{
                aux = arrayTen[i];
                arrayTen[i] = arrayTen[i + 1];
                arrayTen[i + 1] = aux;
            //}
        }
        for (int i : arrayTen) 
        {
            System.out.printf("%d, ", i);    
        }
        System.out.println();
        System.out.println("Array invertido: ");
        int auxInv;
        for (int i = 0; i < arrayTen.length / 2 ; i++)
        {
            auxInv = arrayTen[i];
            arrayTen[i] = arrayTen[arrayTen.length - 1 - i];
            arrayTen[arrayTen.length - 1 - i] = auxInv;
        }
        for (int i : arrayTen)
        {
            System.out.printf("%d, ", i);
        }
        System.out.println();
        System.out.println("Posición del primer par y del último impar: ");
        for (int i : arrayTen)
        {
            if(i % 2 == 0)
            {
                System.out.println("Primer par: "+i);
                break;
            }
        }
        for (int i = arrayTen.length - 1; i >= 0 ; i--)
        {
            if(arrayTen[i] % 2 != 0)
            {
                System.out.println("Último impar: "+arrayTen[i]);
                break;
            }
        }
    }
}
