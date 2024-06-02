package Loops;
import java.util.Scanner;
public class Ap1 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term :");
        int n =  input.nextInt();
        for(int i = 4 ; i <= 3*n +1 ; i=i+3)
        {
            System.out.print(i+" ,");
        }
        int a = 4;
        for(int i = 1 ; i<=n  ; i++)
        {
            System.out.println(a);
            a=a+3;
        }
    }
}
