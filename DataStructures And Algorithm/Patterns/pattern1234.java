package Patterns;
import java.util.Scanner;
public class pattern1234
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = input.nextInt();

   System.out.print("Enter the  number in rows ");
    int column = input.nextInt();

    for(int i = 1; i <= row ; i++)
    {
        for(int j = 1 ; j<= column ; j++)
        {
            System.out.print(j );
        }
        System.out.println();
    }
    }
}
