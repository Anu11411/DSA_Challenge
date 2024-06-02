package RECURSION;
import java.util.Scanner;
public class Print_1_to_N
 {
    public static  void print(int n)
    {
         // Iterative way to print 1 to n
         for(int i = 1 ; i<= n ; i++)
         {
            System.out.println(i);
         }
    }
 public static void main(String[] args) 
 {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = input.nextInt();
      print(n);
 }
    
}
