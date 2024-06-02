package Loops;
import java.util.Scanner;
public class PrintN 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n :");
        int n = input.nextInt();
        for(int i = 1; i<= n ; i++)
        {
            System.out.println("Hello.");
        }
    }
}
