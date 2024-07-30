
//function overloading using data type
import java.util.*;
public class Question_5 {
   //function to calculate int sum 
   public static int sum(int a, int b){
      return a+b;
   }

   //function to calculate float sum 
   public static float sum(float a, float b){                 
      return a+b;
   }
   public static void main(String[] args) {                   
      System.out.println(sum(15, 10));
      System.out.println(sum(8.5f, 2.9f));
   }
}