package Arrays;
import java.util.Scanner;
/*
 * Find the minimum value out of all the elements in the array
 */
public class MinimumElementsArray {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();
            int arr[] = new int [size];
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("enter the "+ i +" element :");
             arr[i]= input.nextInt();
        }
        int temp = Integer.MAX_VALUE;
        for(int i = 0 ; i < size ; i++)
        {
             if( arr[i] <temp)
             {
                temp = arr[i];
             }
        }
        System.out.println(temp);
    }
}
