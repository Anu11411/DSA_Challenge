package Patterns;
import java.util.Scanner;
public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = input.nextInt();
          int c = 65;
        for(int i = 1 ; i <= rows ; i++ )
        {
             for(int j =1; j <= rows - i ; j++)
             {
                System.out.print(" ");
             }
             for(int k = 65; k <= c; k++){
                System.out.print((char)k);
             }
             c = c +2;
             System.out.println();
        }
    }
}
