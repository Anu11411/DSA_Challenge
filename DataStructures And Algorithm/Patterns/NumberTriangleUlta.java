package Patterns;
import java.util.Scanner;
public class NumberTriangleUlta
 {
    public static void main(String[] args)
     {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of rows :");
      int rows = input.nextInt();
      
      for(int i = rows; i >= 1 ; i--)
      {
        for(int j = 1 ; j <= i ; j++)
        {
            System.out.print(j);
        }
        System.out.println();
      }
    }
}
