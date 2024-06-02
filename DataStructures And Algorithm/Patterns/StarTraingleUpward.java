package Patterns;
import java.util.Scanner;
public class StarTraingleUpward
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines :");
        int rows = input.nextInt();
           
        for(int i = 4 ; i >= 1 ; i--){
           for(int j = i ; j >= 1 ; j--){
            System.out.print("*");
           }
           System.out.println();
        }
       
    }
}

