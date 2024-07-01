package Patterns;
import java.util.Scanner;
public class AlphabetTrianglee {
    public static void main(String[] args) 
    {
     Scanner input= new Scanner(System.in);
     System.out.print("Enter the number of rows :"); 
     int row = input.nextInt();
  
     for(int i = 1 ; i <= row ; i++)
     {       int ch  = 65;
         for(int j= 1; j <= row ; j++)
         {
             if((row-i) >= j )
             System.out.print(" ");

         else{
            System.out.print((char)ch);
            ch++;
         }
        
     }
     System.out.println();
 }  
    }
}
