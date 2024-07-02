package Arrays;
import java.util.Scanner;
/*
 * Find the maximum value out of all the elements in the array
 */
public class MaximumElement
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();
       
        int arr[] = new int[size];
        
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("Enter the element :");
             arr[i] = input.nextInt();
        }
      int temp =arr[i];
        for(int i = 0 ; i < size; i++)
        {
             if(arr[i] > temp){
                temp = arr[i];
             }
        }
        System.out.println("Maximum value out of all the elements in the array is :" + temp);
    }
}
