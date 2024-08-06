package Patterns;
import java.util.Scanner;
public class NumberPyramidMast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = input.nextInt();
         int c = 1;
       
        for(int i = 1 ; i <= row ; i++)
        {
            int a = i-1;
            for(int j = 1 ; j <= row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= c; k++){
                System.out.print(k);
            }
            for(int l = 1; l <= i-1; l++)
            {      
                System.out.print(a);
                a--;
            }
            c++;
            System.out.println();
        }
    }
    
}
