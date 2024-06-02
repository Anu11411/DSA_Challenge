package RECURSION;
import java.util.Scanner;

public class FibonacciDirectWay
{
   public static void fibo(int n)
   {
        int firstTerm = 1;
        int nextTerm=0;
        for(int i = 1;i <=n ; i++)
        {
          nextTerm = firstTerm + nextTerm ;   
        }
   }
 public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the nth term:");
    int n = input.nextInt();
    fibo(n);
 }
}