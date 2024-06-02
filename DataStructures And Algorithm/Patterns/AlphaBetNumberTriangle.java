package Patterns;
import java.util.Scanner;
public class AlphaBetNumberTriangle
 {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of rows :");
     int rows = input.nextInt();

     for(int i = 1; i <=rows ; i++)
     {
         if( i % 2 != 0){
            for(int j = 1; j<= i ; j++){
                System.out.print(j);
            }
         }
         if( i % 2 == 0){
            for(int j = 65 ; j <65+i ; j++)
            {
                System.out.print((char)j);
            }
         }
         System.out.println();
     }
}
 }