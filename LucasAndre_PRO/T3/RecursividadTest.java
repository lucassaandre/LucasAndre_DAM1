public class RecursividadTest
{
    public static void main(String[] args)
    {
        int num1 = 1000;
	    int r;
	    r = num1;
	    //numbers(r);
        System.out.println(r
        );
    }
    private static void numbers(int r)
    {
        while(r >= 10)
        {
            numbers(r/10);
            numbers(r%10);
            System.out.println(r);
        }
    }
}