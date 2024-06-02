package Patterns;
import java.util.Scanner;
public class OddNumberTriangle 
{
    public static void main(String[] args)
     {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = input.nextInt();
       
        for(int j = 1; j<= rows ; j++){
            int oddNumber = 1;
        for(int i = 1;  i<= j ; i++){
            System.out.print(oddNumber+" ");
            oddNumber = oddNumber+2;
        }
        System.out.println();
    }
}
}
