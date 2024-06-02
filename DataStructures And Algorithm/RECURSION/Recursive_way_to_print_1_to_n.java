package RECURSION;
import java.util.Scanner;
public class Recursive_way_to_print_1_to_n 
{
    public static int print(int n,int x)
    {
         if( x == n+1)
          return  0;
          System.out.println(x);
          return print(n,x+1);
    }
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        int result = print(n,1);
    }
}
