package RECURSION.STRINGS;

public class StringBuilders
 {
 public static void main(String[] args) 
 {
   StringBuilder str = new StringBuilder("Anupriya Rani");
   // Append Function
   str.append("Anupriya ");
   System.out.println(str);
   str.setCharAt(0, 'M');
   System.out.println(str);
   str.append(1);
   System.out.println(str);
   str.insert(0,'s');
   System.out.println(str);
   
 }    
}
