package Arrays;
import java.util.Scanner;
/*
 * Write a program to copy the contents of one
 * array into another in the reverse order
 */
public class CopyArrayandRevere
 {
    public static void main(String[] args)
     {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size =  input.nextInt();

        int arr[]= new int[size];
        int brr[] = new int [size];

        for(int i = 0 ; i < size; i++)
        {
            System.out.print("Enter the " + i + " element : ");
             arr[i] = input.nextInt();
        }

        for(int i = 0; i< size ; i++)
        {
            brr[i]= arr[size-1-i];
        }
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(brr[i]+ " ");
        }
        
    }
}
