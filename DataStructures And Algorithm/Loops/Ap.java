package Loops;
import java.util.Scanner;
public class Ap
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term :");
        int n = input.nextInt();
        // for(int i = 1 ; i <= n ; i= i+ 2)
        // {
        //     System.out.print(i+ " ");
        // }
        for(int i = 1; i <=2*n - 1 ; i=i+2)
        {
            System.out.println(i);
        }
    }

}
