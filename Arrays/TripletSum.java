package Arrays;
/*
 * Count the number of triplets whose sum is equal to the given value of x.
 */
import java.util.Scanner;
public class TripletSum {
    public static void main(String[] args)
     {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of array :");
      int size = input.nextInt();
      System.out.println("Enter the value of x :");
      int x = input.nextInt();
      int arr[] = new int[size];

      for(int i =0; i < size ; i++)
      {
          System.out.println("Enter the "+ i +" element.");
          arr[i] = input.nextInt();
      }

      int count = 0;

      for(int i = 0 ; i < size ; i++)
      {
        for(int j = i+1; j < size ; j++)
        {
            for(int z = j+1; z < size ; z++)
            {
                if(arr[i] + arr[j]+ arr[z] == x){
                     System.out.println(arr[i] +" "+ arr[j] + " "+ arr[z]);
                count = count + 1;
            
                    }
        }
      }
      System.out.println("Number of triplets :"+ count);
    }
    
}
