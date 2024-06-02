package RECURSION;
// Iterative way to print from n to 1
import java.util.Scanner;
public class PrintNtoOne
{
    public static void print(int n)
    {
        for(int i = n;    i != 0;i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        print(num);

    }
}