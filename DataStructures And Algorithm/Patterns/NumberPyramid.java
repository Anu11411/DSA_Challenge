package Patterns;
/*
 * 
 * output
 * Enter the number or rows :6
     1
    123
   12345
  1234567
 123456789
1234567891011
 */
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number or rows :");
        int row = input.nextInt();

          int n = 1; 


          for(int i = 1; i <= row ; i++)
          {
            for(int j = 1 ; j <= row - i ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1; k <= n;k++){
                System.out.print(k);
            }
            n=n+2;
            System.out.println();
          }
        
    }
}
