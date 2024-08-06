package Patterns;
import java.util.Scanner;
public class StarDiamondd {
     public static void main(String[] args)
      {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row");
        int n = input.nextInt();
// n is always odd 
         int nsp = n/2;
         int  nst = 1;
           int middle_line = n/2 + 1;
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1; j <= nsp ; j++){// this is for spaces
                  System.out.print(" ");
            }
            for(int k = 1; k <=nst; k++){// this is for star
                  System.out.print("*");
            }
            if( i < middle_line){
                nsp--;
                nst +=2;
            }
            else{
                nsp++;
                nst -=2;
            }
            System.out.println();
        }
     }
}
