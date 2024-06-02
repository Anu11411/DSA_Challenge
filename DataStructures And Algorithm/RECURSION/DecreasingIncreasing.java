package RECURSION;
import java.util.Scanner;
public class DecreasingIncreasing 
{
    public static void print(int n)
    {
        //Iterative way 
        for(int i = n ; i !=0;i--)
        {
            System.out.println(i);
        }
        for(int j = 1; j <=n ; j++)
        {
            System.out.println(j);
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
