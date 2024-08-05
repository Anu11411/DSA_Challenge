package Patterns;
import java.util.Scanner;
public class Rhombus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = input.nextInt();

        
        for(int i = 1 ; i <= row; i++){
            for(int j = 1; j <= row+(row-i) ; j++){
                    if(j <= (row+(row-i)) - row){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
    }
}