package Arrays;
import java.util.Scanner;
/*
 * Write a program to reverse the array without using any extra array
 */
public class ReverseWithoutUsingExtraVariable
 {
       public static void main(String[] args)
        {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the size of array :");
           int size = input.nextInt();
           int arr[] = new int [ size];

           for(int i = 0 ; i < size ; i++)
           {
                System.out.println("Enter the "+ i + " element : ");
                 arr[i] = input.nextInt();
           }
          
           
          
                for(int i = 0 ; i < size / 2; i++)
                {
                    arr[i] = arr[i]+ arr[size-1-i];
                    arr[size-1-i] = arr[i] - arr[size -1 - i];
                    arr[i]= arr[i]- arr[size -1 -i];
                    
                }
                for(int i = 0 ; i < size ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
           
        
       }    
