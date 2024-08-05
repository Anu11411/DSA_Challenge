package Patterns;
import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        System.out.print("Enter the number of row :");
        int row = input.nextInt();

       int nst = 1; 

       for(int i = 1; i <=row; i++){
           for(int j = 1; j <= row - i ; j++){
            System.out.print(" ");
           }
           for(int j = 1; j <= nst; j++){
            System.out.print("*");
           }
           nst = nst + 2;
           System.out.println();
       }
    
}
}