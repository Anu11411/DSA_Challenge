package Patterns;
import java.util.Scanner;
public class NumberTriangleU 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = input.nextInt();
        for(int i = 1; i <= row ; i++)
        {
            for(int j = 1; j <=i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
