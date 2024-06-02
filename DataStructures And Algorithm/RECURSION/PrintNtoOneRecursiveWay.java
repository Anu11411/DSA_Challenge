package RECURSION;
import java.util.Scanner;
// Recursive way to find n to 1 number 
public class PrintNtoOneRecursiveWay 
{
    public static int print(int n)
    {
             if(n == 0)
             return 0;
             System.out.println(n);
             return print(n-1);

    }
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number :");
      int n = input.nextInt();  
      int result = print(n);      
    }
}
