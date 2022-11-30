public class ArrayUni1
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * (51 - 10) + 10);    
        }

        for (int i : array)
        {
            System.out.println(i);     
        }
    }    
}
