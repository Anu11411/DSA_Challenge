package Loops;
import java.util.Scanner;
public class FactorialNumber
 {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number ");   
     int num = input.nextInt();
     // 5 = 5 * 4*3*2*1;
     int fact = 1;
     for(int i = 1; i<=num ; i++){
       fact = fact * i;
       System.out.println("Factorial of "+ i + " is " +fact);
     }
    // System.out.println(fact);
    }
}
