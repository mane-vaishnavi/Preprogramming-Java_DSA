
//function overloding
import java.util.*;
public class Overloding {
   //function to calculate sum of 3 nums
   public static int sum(int a, int b){
      return a+b;
   }

   //function to calculate sum of 3 nums
   public static int sum(int a, int b, int c){
      return a+b+c;
   }
   public static void main(String[] args) {                   
      System.out.println(sum(5, 10));
      System.out.println(sum(12, 2, 20));
   }
}