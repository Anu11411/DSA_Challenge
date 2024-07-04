package Arrays;
import java.util.Scanner;
/*
 * If an array arr contains n elements , then check if the given
 * 
 */
public class ArrayPalindrome {
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array :");
    int size = input.nextInt();
    int arr[] = new int [size];
    int count = 0;
    for(int i = 0 ; i < size ; i++)
    {
        System.out.print("Enter the "+ i+" element :");
         arr[i] = input.nextInt();
    }
    for(int i = 0 ; i< size/2 ; i++){
         if(arr[i] == arr[size -1-i])
         {
           count = count+1;
         }
        }
        if(count == size /2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
         
         }
    }
      
    
     

