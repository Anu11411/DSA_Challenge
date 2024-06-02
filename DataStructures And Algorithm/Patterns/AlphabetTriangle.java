package Patterns;
import java.util.Scanner;
public class AlphabetTriangle 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows :");
        int rows = input.nextInt();

        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = 65 ; j <65+ i; j++){
              System.out.print((char)j);       
            }
            System.out.println();
        }
    }
}
