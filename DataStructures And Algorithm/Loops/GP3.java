package Loops;
import java.util.Scanner;
public class GP3
 {
    public static void main(String[] args)
     {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the nth term :");
       int n = input.nextInt();
        double a = 100;
        for(int i = 1; i<= n ; i++)
        {
            System.out.println(a);
            a = a* 0.5;
           
        } 
    }
}
