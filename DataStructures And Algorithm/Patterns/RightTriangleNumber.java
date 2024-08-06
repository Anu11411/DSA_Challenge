package Patterns;
import java.util.Scanner;
public class RightTriangleNumber 
{
    public static void main(String[] args)
     {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows ;");   
    int row = input.nextInt();
    
    for(int i = 1; i <=row ; i ++)
    {
        int a = i -1;
        for(int j = 1; j <= i ; j++){
            System.out.print(j);
        }
        for(int k = 1; k <= i-1 ; k++)
        {
            System.out.print(a);
            a--;
        }
        System.out.println();
    }
   
    }
}
