package Arrays;
import java.util.Scanner;
/*
 * Given an array of integers, change the value of all odd 
 * indexed elements to its second multiple and increment all 
 * even indexed value by 10
 */
public class ElementValueChange 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the size of array :");   
     int size = input.nextInt();

     int arr[] = new int [size];
      
     for(int i = 0 ; i < size ; i++)
     {
        System.out.print("Enter "+i+" element :");
            arr[i] = input.nextInt();
     }
     for(int i = 0 ; i < size ; i++)
     {
        if(i%2 == 0)
        {
            arr[i]= arr[i] + 10;
        }
        else{
             arr[i] = arr[i] * 2;
        }
     }
     for(int i = 0; i< size ; i++)
     {
        System.out.print(arr[i] +" ");
     }
    }
}
