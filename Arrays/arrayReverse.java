package Arrays;
import java.util.Scanner;
public class arrayReverse {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of array :");
      int size = input.nextInt();

      int arr[] = new int [size];

      for(int i = 0 ; i < size ; i++)
      {
        System.out.println("Enter the "+ i+ " element of the array :");
         arr[i] = input.nextInt();
      }

      // Reverse of the array 

      for(int i = size ; i > 0 ; i--){
        System.out.print(i+" ");
      }
  }   
}
