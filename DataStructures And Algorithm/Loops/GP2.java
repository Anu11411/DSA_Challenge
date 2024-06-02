package Loops;
import java.util.Scanner;
public class GP2
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term :");
        int n = input.nextInt();

        for(int i =3 ; i <= 3* Math.pow(4, n-1) ; i= i*4)
        {
            System.out.println(i );
        }
    }
}

