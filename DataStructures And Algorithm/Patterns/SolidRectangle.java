package Patterns;
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line :");
    int line = input.nextInt();    
    System.out.println("Enter the number of stars :");
    int star = input.nextInt();

    for(int i = 1 ; i<= line ; i++)
    {
        for(int j = 1 ; j<= star ; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
