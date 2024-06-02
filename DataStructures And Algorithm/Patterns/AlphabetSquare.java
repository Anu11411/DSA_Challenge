package Patterns;
import java.util.Scanner;
public class AlphabetSquare {
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the rows :");
    int r = input.nextInt();
    for(int i = 1; i<= r ; i++)
    {
      for(int j = 65; j < 65+r ; j++){
         System.out.print((char)j);
           
    
        }
    System.out.println();
  }   
}}
