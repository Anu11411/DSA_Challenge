package Arrays;
import java.util.Scanner;
/*
 * Find the second largest element in the given array.
 */
public class SecondLargestElement {
     public static void main(String[] args) 
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();

        int arr[] = new int [size];
        
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("Enter the " +i + " element : ");
            arr[i] = input.nextInt();
        }
        int temp = Integer.MIN_VALUE;
        for(int i = 0 ; i < size ; i++)
        {
           if(arr[i] > temp){
            temp = arr[i];
           }
        }
      
         int second = Integer.MIN_VALUE;
          for(int i = 0 ; i < size ; i++)
          {
            if( arr[i] != temp  && arr[i] > second  )
            {
                second = arr[i];
            }
          }
          System.out.println(second);


     }
}
