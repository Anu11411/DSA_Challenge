package Arrays;
import java.util.Scanner;
/*
 * Count the number of elements in given array greater than a given number x
 */
public class countNoGreaterthanGivenNo {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number X :");
        int x = input.nextInt();
        System.out.print("Enter the size of array :");
        int size = input.nextInt();

        int arr[] = new int[size];
       // Taking array element as input
        for(int i = 0 ; i < size; i++)
        {
            System.out.print("Enter the "+i+ " element");
            arr[i]= input.nextInt();
        }
        //counting the number of elements in given array
           int count = 0;
        for(int i = 0 ; i < size ; i++)
        {
            if(arr[i] >x){
                count= count + 1;
            }
        }
        System.out.println("The number of elements in given array greater than a"+ x + " is "+ count);
      

    }
}
