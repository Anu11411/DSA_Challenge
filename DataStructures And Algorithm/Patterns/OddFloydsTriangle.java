package Patterns;
import java.util.Scanner;
public class OddFloydsTriangle {
// output 
//     Enter the number of rows :4
// 1
// 35
// 7911
// 13151719
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = input.nextInt();
        int a = 1;
        for(int i = 1 ; i<= rows ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(a);
                a=a+2;
            }
            System.out.println();
        }
    }
}
