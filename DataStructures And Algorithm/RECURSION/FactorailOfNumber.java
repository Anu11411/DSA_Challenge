package RECURSION;
import java.util.Scanner;
public class FactorailOfNumber {
    // Iterative way to find the factorial of a number 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        int fact= 1;
         for(int i = 1; i <= num ; i++)
         {
           fact =i*fact; 
                
         }
         System.out.println("Factorial of a number is "+fact);
    }
}
