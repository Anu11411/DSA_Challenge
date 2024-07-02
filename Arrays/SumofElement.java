package Arrays;
/*
 * Calculate the sum of all the elements in
 * the given array
 */
import java.util.Scanner;
public class SumofElement {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the element :");
        int n = input.nextInt();
          int arr[] = new int [n];
          int sum = 0; 
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Enter the " + i + " element :");
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i < n ; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements :"+ sum);
    }
}
