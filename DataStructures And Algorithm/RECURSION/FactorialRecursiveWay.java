package RECURSION;
import java.util.Scanner;
// Recursive way to find the factorial of a number 
public class FactorialRecursiveWay{
         public static int findRecursion(int n)
         {
            if (n == 0 || n == 1)
            return 1 ;
            return n * findRecursion(n-1);
         } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
          int result = findRecursion(num);
          System.out.println("Factorial of number is "+ result);

     }
}