public class Calculator
{
    public static int add(int... num)
    {
        int result = 0;
        for (int i = 0; i < num.length; i++)
        {
            result += num[i];
        }
        System.out.println(result);
        return result;
    }
    public static int multiply(int... num)
    {
        int result = 1;
        for (int i = 0; i < num.length; i++)
        {
            result *= num[i];
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args)
    {
        add(1,2,3,4,5);

        add(1,2);

        add(-1,-1);

        multiply(1,2,3,4,5);

        multiply(1,3);

        multiply(-1,3);
    }
}

