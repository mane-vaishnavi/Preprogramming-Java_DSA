
//Inverted & rotated half-Pyramid pattern
import java.util.*;
public class Inverted_And_Rotated_HalfPyramidPattern {

   public static void pyaramid(int n) {
      //outer loop
      for(int i=1; i<=n; i++){                                     
         //spaces                                                    
         for(int j=1; j<=n-i; j++){                                 
            System.out.print(" ");                                  
         }
         //stars
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }

   }
   public static void main(String[] args) {
      pyaramid(4);
   } 
}
