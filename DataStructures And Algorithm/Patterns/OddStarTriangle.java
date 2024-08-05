package Patterns;
import java.util.Scanner;
public class OddStarTriangle
 {
    public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number or rows :");
         int row = input.nextInt();
          
         for(int i = 1; i <= row; i++){
            for(int j = 1 ; j <=2*i -1; j++){
               System.out.print("*");
            }
            System.out.println();
         }
    }   
}
