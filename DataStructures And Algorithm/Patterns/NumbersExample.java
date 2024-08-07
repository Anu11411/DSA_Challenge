package RECURSION;
public class NumbersExample {
/*--- function calling another function

 ---How function calls work in language
    * While the function is not finished executing , it will remain in stack
    * main  function is the  first function which goes into the stack and last function
            that will come out of the stack.
    * When a function is staying  inside the stack that means function call is currently going on
    * when a function finished executing it is removed from stack and the flow of program is restored from where the
      fucntion is called
  
 ---Why we use recursion
    * Here we are making repetition , Each function have same body
      (printing the number and calling another function) if we want to print the 100 number
      we don't copy paste function 100th time  , instead we call function itself   
                 
*/    
static void print1(int n){
        System.out.println(n); 
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
         print1(1);
        

    }
}
