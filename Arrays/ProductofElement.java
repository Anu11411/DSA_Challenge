package Arrays;
import java.util.Scanner;
/*
 * Calculate the product of all the elements in the given array
 */
public class ProductofElement {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array :");
    int size = input.nextInt();
     int arr[] = new int [size];
         int product = 1; 
     for(int i = 0; i < size; i++)
     {
        System.out.print("enter the " + i+" element :");
        arr[i] = input.nextInt();
     }
     for(int i = 0; i < size ; i++)
     {
         product = product * arr[i];
     }
     System.out.println("Product of all the elements in the array is :"+ product);
  }   
}
