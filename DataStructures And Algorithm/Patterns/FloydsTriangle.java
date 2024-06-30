 package Patterns;
 import java.util.Scanner;
public class FloydsTriangle{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = input.nextInt();
        int a = 1;
        for(int i = 1; i <= row; i++)
        {  
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print( a);
                a++;
            }
            System.out.println();
        }
    }
}