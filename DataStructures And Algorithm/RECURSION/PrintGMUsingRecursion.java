package RECURSION;
import java.util.Scanner;
public class PrintGMUsingRecursion
 {
    public static int print(int n)
    {
       // Printing n times Good Morning using Recursion
       if(n == 0)
       return 0;
           System.out.println("Good Morning");
          return  print(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times :");
       int n = input.nextInt();
       int result = print(n);
    }    
}
