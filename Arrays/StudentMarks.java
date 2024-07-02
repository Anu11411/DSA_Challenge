package Arrays;
import java.util.Scanner;
/*
 *  input an array of marks of  any number of students , if the
 * mark of any student is less than 34 print its roll number.[roll
 * number here refers to the index of the array]
 */
public class StudentMarks {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students :");
        int n_stud = input.nextInt();
         
        int marks []= new int [n_stud];
        for(int i = 0 ; i < n_stud ; i++)
        {
            System.out.print("Enter marks of "+i+" student :");
            marks[i] = input.nextInt();

        }
        System.out.println(" roll number of students whose marks is less than 35 :");
         for(int i = 0 ; i < n_stud ; i++)
         {
             if(marks[i] < 35)
             System.out.print(i+" ");  
         }
     }
}
