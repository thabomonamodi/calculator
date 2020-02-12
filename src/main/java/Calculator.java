import java.util.Scanner;

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
        /*Scanner scan = new Scanner(System.in);
        System.out.println("would you like to participate? (y/n)(Y/N)");
        String ans = scan.nextLine();
        int num=0;
        int num1=0, num2=1;
        while(ans.equalsIgnoreCase("y"))
        {
            System.out.println("please enter a number: ");
             num = scan.nextInt();
             if (num!= num)
             {
                 break;
             }
             num1 +=num;
             num2 *=num;
            //System.out.println("please enter number: ");
             //num1 = scan.nextInt();

        }
        add(num1);
        multiply(num1);*/
        add(1,2,3,4,5);
// should return 15
        add(1,2);
// should still return 3
        add(-1,-1);
// should still return -2
        multiply(1,2,3,4,5);
// should return 120
        multiply(1,3);
// should still return 3
        multiply(-1,3);
// should still return -3


    }
}

